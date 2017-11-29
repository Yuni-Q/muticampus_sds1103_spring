package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import repository.FileDao;
import vo.FileInfoVO;

@Controller
public class FileController {
	@Autowired
	private FileDao dao;
	public void setDao(FileDao dao) {
		this.dao = dao;
	}
////////////////////////////////////////////////////////////
	@RequestMapping("/fileList.do")
	public ModelAndView fileList(){
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("fileList", dao.selectAll());
		mv.setViewName("file_list"); // file_list.jsp
				
		return mv;
	}
	
	@RequestMapping(value="/upload.do", method=RequestMethod.POST)
	public ModelAndView upload(FileInfoVO fileInfo){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("upload_result"); // upload_result.jsp
		
		String saveDir = "c:/springFiles/";
		
		File dir = new File(saveDir);
		if(dir.exists()==false){
			// ���ε� ������ ������ �����϶�.
			dir.mkdir();
		}
		
		String savedName = saveDir + new Random().nextInt(1000000000);
		
		// ���� �̸����� �� ���� �ϳ� �����
		File savedFile = new File(savedName);
		
		try {
			// ����ڰ� ���ε� �� ������ �� ���Ϸ� �����ϱ�
			fileInfo.getUploadFile().transferTo(savedFile);
			
			// ���ε� ������ ��� �����ϱ�
//			FileInfoVO fileInfo = new FileInfoVO();
			fileInfo.setOriginalName
					(fileInfo.getUploadFile().getOriginalFilename());
			fileInfo.setSavedPath(savedFile.getAbsolutePath());
			int result = dao.insert(fileInfo);
			
			mv.addObject("uploadResult", result);
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return mv;
	}

	@RequestMapping("/download.do")
	public void download(int fileNum, HttpServletResponse response){
		FileInfoVO fileInfo = dao.select(fileNum);
		
		response.setContentType
		("application/octet-stream; charset=UTF-8");
		response.setHeader
		("Content-Disposition", 
		"attachment; filename=\""+fileInfo.getOriginalName()+"\"");
		
		try {
			// �о���̴� stream
			FileInputStream is = 
				new FileInputStream(fileInfo.getSavedPath());
			
			// �������� stream
			ServletOutputStream os = response.getOutputStream();
			
			int data = 0;
			while((data = is.read()) != -1){
				os.write(data);
			}
			
			is.close();
			os.close();			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}



















