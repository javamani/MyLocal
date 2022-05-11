/**
 * 
 */
package com.towerplus.fileupload.service;

import java.nio.file.Path;
import java.util.stream.Stream;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author Administrator
 *
 */
public interface FileUploadService {
	
	void deleteAll();
	
	Stream<Path> loadMultipleFiles();
	
	boolean storeFile(MultipartFile multiPartFile);
	
	Path getFile(String fileName);
	
	Resource loadAsResource(String fileName);	

}
