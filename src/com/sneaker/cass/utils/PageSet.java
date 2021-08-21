package com.sneaker.cass.utils;

import java.util.List;
import java.util.Map;
/**
 * ��ҳʱ���صĽ����
 * @author nhds
 *
 */
public class PageSet {
	private int pageSize;
	private int dataCount;
	private int start;
	
	private int pageCount;
	private int page;
	private List<Map<String,Object>> dataResult;
	public  PageSet(){
	}
	public int getStart() {
		start=(page-1)*pageSize;
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}
	public int getDataCount() {
		return dataCount;
	}
	public void setDataCount(int dataCount) {
		this.dataCount = dataCount;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public List<Map<String,Object>> getDataResult() {
		return dataResult;
	}
	public void setDataResult(List<Map<String,Object>> dataResult) {
		this.dataResult = dataResult;
	}
	@Override
	public String toString() {
		return "PageSet [pageSize=" + pageSize + ", dataCount=" + dataCount
				+ ", start=" + start + ", pageCount=" + pageCount + ", page="
				+ page + ", dataResult=" + dataResult + "]";
	}

}

