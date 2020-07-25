package hospital_management;
import hospital_process.*;

import java.io.*;
import java.util.Scanner;
 
public class Doctor
{

	int DoctorID;
	String DoctorName;
	int age;
	char DoctorSex;
	String DoctorSpeciality;
	String assignPatient;

	HospitalProcess hm = new HospitalProcess();
	
	public Doctor() {}

	Scanner s=new Scanner(System.in);
	
	public Doctor(int DoctorID,String DoctorName,int age,char DoctorSex,String DoctorSpeciality)
		{
			this.DoctorID=DoctorID;
			this.DoctorName=DoctorName;
			this.age=age;
			this.DoctorSex=DoctorSex;
			this.DoctorSpeciality=DoctorSpeciality;

		}

	public void registerDoctor()throws Exception 
		{
			Doctor dr = new Doctor();
			
			int DoctorID= hm.arl.size();
			dr.DoctorID = DoctorID+1;

			System.out.println("Enter Doctor name:");
			dr.DoctorName = s.nextLine();

			System.out.println("Enter Doctor Age:");
			dr.age = s.nextInt();

			System.out.println("Enter Doctor Sex:");
			dr.DoctorSex =s.next().charAt(0);

			System.out.println("Enter Doctor's Speciality:");
			dr.DoctorSpeciality = s.next();

			hm.ar2.add(dr);
		}



	public void removeDoctor() throws Exception 
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Doctor ID:");
			int id1 = s.nextInt();
			id1=id1-1;
			hm.ar2.remove(id1);
		}

	public void showDoctorDetails() throws IOException
		{
		File f=new File("C:\\Hospital Management\\Filehp.txt");
		{
			FileReader myFile2=new FileReader(f);
			Scanner ab=new Scanner(myFile2);
			while(ab.hasNextLine())
			{
				String data=ab.nextLine();
				System.out.println(data);
			}
			ab.close();
			
		FileWriter myFile= new FileWriter(f);
		{
			
		
			myFile.write("\nDoctor-ID \tDoctor-Name \tAge \t Sex \tSpeciality \t Assigned_Patient\n");
			for(int i=0; i<hm.ar2.size(); i++)
				{
					String abc=hm.ar2.get(i).DoctorID + "\t\t"+hm.ar2.get(i).DoctorName+"   \t"+hm.ar2.get(i).age+"\t  "+hm.ar2.get(i).DoctorSex+"\t"+hm.ar2.get(i).DoctorSpeciality+" \t  "+hm.ar2.get(i).assignPatient;
					myFile.write(abc);
					myFile.write("\n");
				}
			myFile.close();
		}
			
		
		
		
		
		}

		}
	
	  public void assignDoctor() throws Exception
	  {
	      
	   for (Patient x: hm.arl)
	   {      
	    for (Doctor y: hm.ar2)
	    {    
	    	
	     if (x.patientIllness.equals("Bone_Injury"))
	     {
	      if (y.DoctorSpeciality.equals("Orthopedist"))
	      {
	    	  y.assignPatient=x.patientName;
	      }
	     }
	     
	     if (x.patientIllness.equals("Dengue_Fever"))
	     {
	      if (y.DoctorSpeciality.equals("Physician"))
	      {
	       y.assignPatient=x.patientName;
	      }
	     }
	     
	     if (x.patientIllness.equals("Heart_Attack"))
	     {
	      if (y.DoctorSpeciality.equals("Surgeon"))
	      {
	       y.assignPatient=x.patientName;
	      } 
	     }
	     
	      if (x.patientIllness.equals("Skin_Allergy"))
	      {
	       if (y.DoctorSpeciality.equals("Dermatologist"))
	       {
	        y.assignPatient=x.patientName;
	       } 
	      }
	      
	      if (x.patientIllness.equals("Alzheimer's "))
	      {
	       if (y.DoctorSpeciality.equals("Neurologist"))
	       {
	        y.assignPatient=x.patientName;
	       } 
	      }
	      
	      if (x.patientIllness.equals("Cataract   "))
	      {
	       if (y.DoctorSpeciality.equals("Ophthalmologist"))
	       {
	        y.assignPatient=x.patientName;
	       } 
	      }
	  
	    }
	   }
	  }

} 
