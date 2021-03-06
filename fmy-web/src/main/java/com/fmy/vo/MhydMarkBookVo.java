package com.fmy.vo;

import java.io.Serializable;

/**
 * Date: 2016-6-2 漫画阅读-收藏漫画Vo
 * 
 * @author luliang_yu
 * @version 1.0
 * 
 */
public class MhydMarkBookVo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 776668141842430042L;
	/**
	 * id
	 */
	private String comicsId;
	/**
	 * 封面
	 */
	private String homePic;
	/**
	 * 漫画名字
	 */
	private String comicsName;
	/**
	 * 一句话介绍
	 */
	private String onewordDesc;
	/**
	 * 更新至N话
	 */
	private String updateChapter;
	/**
	 * 更新至N话(序列)
	 */
	private Integer updateChapterOrder;
	/**
	 * 阅读至N话
	 */
	private String readChapter;
	/**
	 * 阅读至N话(序列)
	 */
	private Integer readChapterOrder;
	/**
	 * 是否有未读(0:未读，1:已读)
	 */
	private int isRead;
	/**
	 * 是否已收藏(0:未收藏，1:已收藏)
	 */
	private int isMark;
	/**
	 * 已收藏数
	 */
	private int haveMarkNum;
	/**
	 * 还可收藏数
	 */
	private int canMarkNum;

	public String getComicsId() {
		return comicsId;
	}

	public void setComicsId(String comicsId) {
		this.comicsId = comicsId;
	}

	public String getHomePic() {
		return homePic;
	}

	public void setHomePic(String homePic) {
		this.homePic = homePic;
	}

	public String getComicsName() {
		return comicsName;
	}

	public void setComicsName(String comicsName) {
		this.comicsName = comicsName;
	}

	public String getOnewordDesc() {
		return onewordDesc;
	}

	public void setOnewordDesc(String onewordDesc) {
		this.onewordDesc = onewordDesc;
	}

	public String getUpdateChapter() {
		return updateChapter;
	}

	public void setUpdateChapter(String updateChapter) {
		this.updateChapter = updateChapter;
	}

	public String getReadChapter() {
		return readChapter;
	}

	public void setReadChapter(String readChapter) {
		this.readChapter = readChapter;
	}

	public int getIsRead() {
		return isRead;
	}

	public void setIsRead(int isRead) {
		this.isRead = isRead;
	}

	public Integer getUpdateChapterOrder() {
		return updateChapterOrder;
	}

	public void setUpdateChapterOrder(Integer updateChapterOrder) {
		this.updateChapterOrder = updateChapterOrder;
	}

	public Integer getReadChapterOrder() {
		return readChapterOrder;
	}

	public void setReadChapterOrder(Integer readChapterOrder) {
		this.readChapterOrder = readChapterOrder;
	}

	public int getIsMark() {
		return isMark;
	}

	public void setIsMark(int isMark) {
		this.isMark = isMark;
	}

	public int getHaveMarkNum() {
		return haveMarkNum;
	}

	public void setHaveMarkNum(int haveMarkNum) {
		this.haveMarkNum = haveMarkNum;
	}

	public int getCanMarkNum() {
		return canMarkNum;
	}

	public void setCanMarkNum(int canMarkNum) {
		this.canMarkNum = canMarkNum;
	}

}
