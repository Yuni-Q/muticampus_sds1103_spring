package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import vo.MemberVO;

@Controller
public class FileController {
	
	@RequestMapping("/uploadForm.do")
	public String uploadForm(){
		return "upload_form"; // upload_form.jsp
	}
	
	@RequestMapping("/upload.do")
	public ModelAndView upload(MemberVO member){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("upload_result"); // upload_result.jsp
		
		String path = "c:/springFiles/"; // ���ε� ������ ����Ǵ� ���
		
		File dir = new File(path);
		if(dir.exists() == false){
			// ���� c:�� springFiles ������ ������ ������
			dir.mkdir();
		}
		
		// ������ ���� ���ڷ� �̸������� �� ������ �ϳ� ����.
		String savedName = path + new Random().nextInt(10000000);
		File savedFile = new File(savedName);
		
		try {
			// ���ε�� ������ ��� ���� savedFile�� �ű��
			member.getMemberFile().transferTo(savedFile);
			
			mv.addObject("originalName", 
					member.getMemberFile().getOriginalFilename());
			mv.addObject("savedName", savedName);
			
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		
		
		return mv;
	}

	
	@RequestMapping("/download.do")
	public void down(HttpServletResponse response){
		response.setContentType
		("application/octet-stream; charset=UTF-8");
		response.setHeader
		("Content-Disposition", "attachment; filename=\"Koalalala.jpg\"");
		
		try {
			// �о���̴� stream
			FileInputStream is = 
				new FileInputStream("c:/springFiles/Koala.jpg");
			
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



















