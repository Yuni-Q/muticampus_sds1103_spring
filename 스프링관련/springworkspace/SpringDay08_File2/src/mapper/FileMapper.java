package mapper;

import java.util.List;

import vo.FileInfoVO;

// mapper.FileMapper
public interface FileMapper {
	public int insert(FileInfoVO fileInfo);
	public FileInfoVO select(int fileNum);
	public List<FileInfoVO> selectAll();
}
