package com.home.managed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Instance;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.constraints.Max;

import com.home.managed.annotations.Random;

@Named("cart")
@javax.enterprise.context.SessionScoped
public class Auth implements Serializable {

	/**
	 * 
	 */

	@Inject @javax.enterprise.context.SessionScoped Bakery bakery;

	private static final long serialVersionUID = 1L;
	private int counter = 0;
	private String name = "Hey There";
	private String password;
	private String groceryText;
	private String email;
	private String containerId;



	public String getEmail() {
		return email;

	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Auth() {
		System.out.println("Auth Constructor is Called");
		Runtime rt = Runtime.getRuntime();
		Process pr ;
		try {
			//pr = rt.exec("docker container ls | awk 'FNR==2{print $1}'");
			pr = rt.exec("hostname");
			pr.waitFor();
			BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));
			String line = null; 
			containerId = "";

			while ((line = input.readLine()) != null)
				containerId += line;

			
			System.out.println(containerId);
		}catch (IOException e) {
			e.printStackTrace();
		}
		catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
			

		}




		public String getName() {
			System.out.println("name getter called");
			return name;
		}
		public void setName(String name) {
			System.out.println("name setter called");
			this.name = name;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getGroceryText() {
			return groceryText;
		}

		public void setGroceryText(String groceryText) {
			this.groceryText = groceryText;
		}

		public void buttonAction(ActionEvent event)
		{
			//groceryText = "Well the page has come through UserMaster Number - " + counter;
			counter++;
			//System.out.println(groceryText);
			email = "umair@cordis.com";
			//System.out.println(bakery.valueS);
		}

		public void handleUserNameChange(ValueChangeEvent event)
		{
			email = "asifsain@gmail.com";
			System.out.println("Old Value : " + event.getOldValue() + "New Value : " + event.getNewValue());

		}

		public String pageSubmitted()
		{
			email = "jamal@gmail.com";
			System.out.println(bakery);
			
			Runtime rt = Runtime.getRuntime();
			Process pr ;
			try {
				//pr = rt.exec("docker container ls | awk 'FNR==2{print $1}'");
				pr = rt.exec("hostname");
				pr.waitFor();
				BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));
				String line = null; 
				containerId = "";

				while ((line = input.readLine()) != null)
					containerId += line;

				
				System.out.println(containerId);
			}catch (IOException e) {
				e.printStackTrace();
			}
			catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			return "UserMaster";

		}

		@PostConstruct
		void checkUp()
		{
			System.out.println("Post Construct of Auth");
		}

		public String getContainerId() {
			return containerId;
		}

		public void setContainerId(String containerId) {
			this.containerId = containerId;
		}





	}
