package com.ynks.pojo;

public class Menu {
   int id;
   String name;
   int lid;
/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the lid
 */
public int getLid() {
	return lid;
}
/**
 * @param lid the lid to set
 */
public void setLid(int lid) {
	this.lid = lid;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "Menu [id=" + id + ", name=" + name + ", lid=" + lid + "]";
}
   
}
