package com.ysc.apps.online.util;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
public class ImageAsync {

	/**
	 * 生成图片缩略图
	 * 
	 * @throws Exception
	 */
	@Async
	public void createThumbnail(File file) throws Exception {
		String newSaveName = "Th_" + file.getName();
		ImageUtils.imgThumb(file, file.getParent() + File.separator + newSaveName, 1920, 1200);
	}
}
