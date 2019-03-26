
	package com.cts.ngo.bean;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="event")
	public class Event {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		int id;
		@Column(name="title")
		String title;
		@Column(name="category")
		String category;
		@Column(name="date_of_post")
		String date;
		@Column(name="address")
		String address;
		@Column(name="description")
		String description;
		
		
		public Event()
		{
			
		}


		@Override
		public String toString() {
			return "event [id=" + id + ", title=" + title + ", category=" + category + ", date=" + date + ", address="
					+ address + ", description=" + description + "]";
		}


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


		public String getCategory() {
			return category;
		}


		public void setCategory(String category) {
			this.category = category;
		}


		public String getDate() {
			return date;
		}


		public void setDate(String date) {
			this.date = date;
		}


		public String getAddress() {
			return address;
		}


		public void setAddress(String address) {
			this.address = address;
		}


		public String getDescription() {
			return description;
		}


		public void setDescription(String description) {
			this.description = description;
		}
		
		
		
		

}
