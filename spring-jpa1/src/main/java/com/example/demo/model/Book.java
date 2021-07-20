package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity //データの入れ物であるエンティティクラスであることをしてする
public class Book {
	@Id//エンティティの主キーを設定する
	@GeneratedValue//主キーの値を自動採番する@Idと一緒にしていする
	private Long id;
	
	private String title;
	private String detail;
}
