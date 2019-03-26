package com.cts.ngo.bean;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="subscribe")
	public class Subscribe {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		int id;
		@Column(name="title")
		String title;
		@Column(name="ngo_name")
		String ngoname;
		@Column(name="status")
		String status;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getNgoname() {
			return ngoname;
		}
		public void setNgoname(String ngoname) {
			this.ngoname = ngoname;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = "inactive";
		}
		
		
		
		
		
		@Override
		public String toString() {
			return "subscribe [id=" + id + ", title=" + title + ", ngoname=" + ngoname + ", status=" + status + "]";
		}
		
		
		
		
		
	
	
	
	
	
	
	
	}
	
	
		