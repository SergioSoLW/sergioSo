package com.sneaker.cass.utils;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class UploadUtil {
	private String uploadPath = "uploads/"; // ����·��
	private String uploadTmp = "tmp/"; // �ϴ���ʱ·��
	private String[] fileType = new String[] { ".jpg", ".gif", ".png", ".jpeg"};// �ϴ��ļ�����
	private int sizeMax = 3; // �ϴ��ļ����ֵ
	private String serverPath;
	private List<FileItem> items;
	private ServletContext servletContext;
	private HttpServletRequest request;
	private ServletFileUpload upload;

	/**
	 * �ϴ��ļ�ʱ���øù��췽��
	 * 
	 * @param inservletContext
	 * @param inrequest
	 */
	public UploadUtil(ServletContext inservletContext,
			HttpServletRequest inrequest) {
		servletContext = inservletContext;
		request = inrequest;

		serverPath = servletContext.getRealPath("/");
		DiskFileItemFactory factory = new DiskFileItemFactory();
		factory.setSizeThreshold(4 * 1024);// ������
		factory.setRepository(new File(serverPath + uploadTmp));// ������ʱ�ļ���

		upload = new ServletFileUpload(factory);
		upload.setHeaderEncoding("UTF-8");
		upload.setSizeMax(sizeMax * 1024 * 1024);
		try {
			items = upload.parseRequest(request);
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * ɾ���ļ�ʱ���øù��췽��
	 * 
	 * @param inservletContext
	 */
	public UploadUtil(ServletContext inservletContext) {
		servletContext = inservletContext;
		serverPath = servletContext.getRealPath("/");
	}

	/**
	 * ��ȡ�����������ļ����ֵ
	 * 
	 * @param paraName
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public String getParameter(String paraName)
			throws UnsupportedEncodingException {
		String value = null;
		for (FileItem item : items) {
			if (item.isFormField()
					&& item.getFieldName().equalsIgnoreCase(paraName)) {
				value = item.getString("UTF-8");
				break;
			}
		}
		return value;

	}

	/**
	 * �ϴ��ļ�
	 * 
	 * @return ���ض���ϴ��ļ������ƣ�����Ϊ��������
	 * @throws Exception
	 */
	public List<String> upload() throws Exception {
		List<String> paths = new ArrayList<String>();
		String initFileName = "";
		if (!checkFileType()) {
			throw new Exception(
					"�ϴ�ʧ�ܣ����ڲ���������͡��ϴ��ļ�����ֻ���ǣ���jpg, gif, png, jpeg����");
		}
		try {
			for (FileItem item : items) {
				if (!item.isFormField()&&!item.getName().isEmpty()) {
					initFileName = item.getName().toLowerCase();
					String uuid = UUID.randomUUID().toString();
					String fileName = uuid + getFileTypeName(initFileName);
					String filePath = serverPath + uploadPath + fileName;
					item.write(new File(filePath));
					paths.add(fileName);
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new Exception("�ϴ�ʧ�ܣ�����ļ�" + initFileName + "���Ƿ񳬹�����ϴ���С"
					+ sizeMax + "M��");
		}
		return paths;
	}
	
	/**
	 * �ϴ��ļ�
	 * 
	 * @return ���ض���ϴ��ļ������ƣ�����Ϊ��������
	 * @throws Exception
	 */
	public Map<String, String> upload2() throws Exception {
		Map<String,String> paths = new HashMap<String,String>();
		String initFileName = "";
		if (!checkFileType()) {
			throw new Exception(
					"�ϴ�ʧ�ܣ����ڲ���������͡��ϴ��ļ�����ֻ���ǣ���jpg, gif, png, jpeg����");
		}
		try {
			for (FileItem item : items) {
				if (!item.isFormField()&&!item.getName().isEmpty()) {
					System.out.print(item);
					initFileName = item.getName().toLowerCase();
					String uuid = UUID.randomUUID().toString();
					String fileName = uuid + getFileTypeName(initFileName);
					String filePath = serverPath + uploadPath + fileName;
					item.write(new File(filePath));
					paths.put(item.getFieldName(), fileName);
					//paths.add(fileName);
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new Exception("�ϴ�ʧ�ܣ�����ļ�" + initFileName + "���Ƿ񳬹�����ϴ���С"
					+ sizeMax + "M��");
		}
		return paths;
	}
/**
 * ɾ���ļ�
 * @param fileName���ṩ��Ҫɾ�����ļ�����(�磺355656dfrre.jpg)
 */
	public void deleteFile(String fileName) {
		File file = new File(serverPath + uploadPath + fileName);
		file.delete();
	}

	private String getFileTypeName(String fileName) {
		return fileName.substring(fileName.lastIndexOf("."));
	}

	private boolean checkFileType() {
		boolean result = true;
		for (FileItem item : items) {
			if (!item.isFormField()&&!item.getName().isEmpty()) {
				String iniFileName = item.getName().toLowerCase();
				String typeName = getFileTypeName(iniFileName);
				boolean flag = false;
				for (int i = 0; i < fileType.length; i++) {
					if (fileType[i].equalsIgnoreCase(typeName)) {
						flag = true;
						break;
					}
				}
				if (!flag) {
					result = flag;
					break;
				}
			}
		}
		return result;
	}

	public String getUploadPath() {
		return uploadPath;
	}

	public void setUploadPath(String uploadPath) {
		this.uploadPath = uploadPath;
	}

	public String getUploadTmp() {
		return uploadTmp;
	}

	public void setUploadTmp(String uploadTmp) {
		this.uploadTmp = uploadTmp;
	}

}
