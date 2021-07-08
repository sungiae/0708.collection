package com.sist.dao;

// 1. ����Ŭ 2. ���� 3. ������ �ǽð� �б�
public class Movie {
	private int mno; // ��ȭ ���� ��ȣ
	private String title;
	private String genre;
	private String director;
	private String actor;
	private String story;
	private String key; // ������ (youtube)
	// �б� / ���� ==> Ŭ������ ����� ���� �������� ==> �ݵ�� (�б�/����, ������ ����ȭ) => ĸ��ȭ
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	
}
