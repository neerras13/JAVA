package employee;

import java.io.Serializable;
public class EModel implements Serializable {
		/**
	 * 
	 */
	private static final long serialVersionUID = 4963358336272443454L;
		/**
		 * 
		 */
		private int id;
		private String Name;
		private int mobile;
		private String email;
		public EModel() {
			super();
		}
		public EModel(int id, String name, int mobile, String email) {
			super();
			this.id = id;
			Name = name;
			this.mobile = mobile;
			this.email = email;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		public int getId() {
			return id;
		}
		public String getName() {
			return Name;
		}
		public int getMobile() {
			return mobile;
		}
		public String getEmail() {
			return email;
		}
		public void setId(int id) {
			this.id = id;
		}
		public void setName(String name) {
			Name = name;
		}
		public void setMobile(int mobile) {
			this.mobile = mobile;
		}
		public void setEmail(String email) {
			this.email = email;
		}
	}
