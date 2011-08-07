package com.ilove.meta;

/**
 * 首页meta对象
 * @author nova
 *
 */
public class Home {
	
	/**
	 * 主键id
	 */
	private long id;
	
	/**
	 * 左边大图封面url
	 */
	private String coverUrl1;
	
	/**
	 * 左边大图封面的链接
	 */
	private String href1;
	
	/**
	 * 右边图1的url
	 */
	private String coverUrl2;
	
	/**
	 * 右边图1的链接
	 */
	private String href2;
	
	/**
	 * 右边图2的url
	 */
	private String coverUrl3;
	
	/**
	 * 右边图2的链接
	 */
	private String href3;	
	
	/**
	 * 最近更新时间
	 */
	private long lastUpdateTime;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCoverUrl1() {
		return coverUrl1;
	}

	public void setCoverUrl1(String coverUrl1) {
		this.coverUrl1 = coverUrl1;
	}

	public String getHref1() {
		return href1;
	}

	public void setHref1(String href1) {
		this.href1 = href1;
	}

	public String getCoverUrl2() {
		return coverUrl2;
	}

	public void setCoverUrl2(String coverUrl2) {
		this.coverUrl2 = coverUrl2;
	}

	public String getHref2() {
		return href2;
	}

	public void setHref2(String href2) {
		this.href2 = href2;
	}

	public String getCoverUrl3() {
		return coverUrl3;
	}

	public void setCoverUrl3(String coverUrl3) {
		this.coverUrl3 = coverUrl3;
	}

	public String getHref3() {
		return href3;
	}

	public void setHref3(String href3) {
		this.href3 = href3;
	}

	public long getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(long lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}
	
	

}
