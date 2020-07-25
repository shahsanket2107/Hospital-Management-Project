package hospital_management;
import hospital_process.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
 
public class Patient 
{
	int patientID;
	String patientName;
	String patientAddress;
	int age;
	char patientSex;
	String patientIllness;
	float amountForAppointment;
	String joindate;
	String medicine;

	HospitalProcess hm = new HospitalProcess();

	public Patient() {}

	Scanner s=new Scanner(System.in);

	public Patient(int patientID,String patientName,String patientAddress,int age,char patientSex,String patientIllness,float amountForAppointment, String joindate)
		{
			this.patientID=patientID;
			this.patientName=patientName;
			this.patientAddress=patientAddress;
			this.age=age;
			this.patientSex=patientSex;
			this.patientIllness=patientIllness;
			this.amountForAppointment=amountForAppointment;
			this.joindate = joindate;
		}

	public void registerPatient()throws Exception 
		{
			Patient pr = new Patient();
			
			int patientID= hm.arl.size();
			pr.patientID = patientID+1;
			System.out.println("Enter Patient name:");
			pr.patientName = s.nextLine();
			System.out.println("Enter Patient Address:");
			pr.patientAddress = s.nextLine();
			System.out.println("Enter Patient Age:");
			pr.age = s.nextInt();
			System.out.println("Enter Patient Sex:");
			pr.patientSex =s.next().charAt(0);
			System.out.println("Enter Patient Illness:");
			pr.patientIllness = s.next();
			System.out.println("Enter the amount patient needs to pay for appointment:");
			pr.amountForAppointment = s.nextFloat();
			pr.joindate = hm.joindate;
			hm.arl.add(pr);
			
		}

	

	public void removePatient() throws Exception
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Patient ID:");
			int id1 = s.nextInt();
			id1=id1-1;
			hm.arl.remove(id1);
		}

	public void updatePatientDetails() throws Exception
		{
			char l;
			Patient p2 = new Patient(patientID, patientName, patientAddress, age, patientSex, patientIllness, amountForAppointment, joindate);
			do
				{
				System.out.println("Enter patient ID you want to update:");

				Scanner s=new Scanner(System.in);
				int idnum = s.nextInt();
				for(int i=0; i<hm.arl.size(); i++)
					{
						if(idnum == hm.arl.get(i).patientID)
							{
								System.out.println("Enter 1 to change patient's name \n 2 to change patient's address \n 3 to change patient's age \n 4 to change patient's illness \n 5 to change registration fees along with the medical expenses");
								int ch = s.nextInt();
							switch(ch)
							{
								case 1:
								System.out.println("Enter new patient's name:");
								p2.patientName = s.next();
								p2.patientID= hm.arl.get(i).patientID;
								p2.patientAddress= hm.arl.get(i).patientAddress;
								p2.age=hm.arl.get(i).age;
								p2.patientSex=hm.arl.get(i).patientSex;
								p2.patientIllness = hm.arl.get(i).patientIllness;
								p2.amountForAppointment = hm.arl.get(i).amountForAppointment;
								p2.joindate = hm.arl.get(i).joindate;
								hm.arl.set(i,p2);
								System.out.println("Patient updated !!!");
								break;
								case 2:
								System.out.println("Enter new patient Address:");
								p2.patientAddress = s.next();
								p2.patientID = hm.arl.get(i).patientID;
								p2.patientName = hm.arl.get(i).patientName;
								p2.age = hm.arl.get(i).age;
								p2.patientSex = hm.arl.get(i).patientSex;
								p2.patientIllness = hm.arl.get(i).patientIllness;
								p2.amountForAppointment = hm.arl.get(i).amountForAppointment;
								p2.joindate = hm.arl.get(i).joindate;
								hm.arl.set(i,p2);
								System.out.println("Patient updated !!!");
								break;
								case 3:
								System.out.println("Enter new Patient age:");
								p2.age = s.nextInt();
								p2.patientID = hm.arl.get(i).patientID;
								p2.patientName = hm.arl.get(i).patientName;
								p2.patientAddress = hm.arl.get(i).patientAddress;
								p2.patientSex = hm.arl.get(i).patientSex;
								p2.patientIllness = hm.arl.get(i).patientIllness;
								p2.amountForAppointment = hm.arl.get(i).amountForAppointment;
								p2.joindate= hm.arl.get(i).joindate;
								hm.arl.set(i,p2);
								System.out.println("Patient updated !!!");
								break;
								case 4:
								System.out.println("Enter new Patient illness:");
								p2.age = hm.arl.get(i).age;
								p2.patientID= hm.arl.get(i).patientID;
								p2.patientName = hm.arl.get(i).patientName;
								p2.patientAddress = hm.arl.get(i).patientAddress;
								p2.patientSex = hm.arl.get(i).patientSex;
								p2.patientIllness = s.next();
								p2.amountForAppointment = hm.arl.get(i).amountForAppointment;
								p2.joindate = hm.arl.get(i).joindate;
								hm.arl.set(i,p2);
								System.out.println("Patient updated !!!");
								break;
								case 5:
								System.out.println("Enter the new amount that patient needs to pay:");
								p2.age = hm.arl.get(i).age;
								p2.patientID = hm.arl.get(i).patientID;
								p2.patientName = hm.arl.get(i).patientName;
								p2.patientAddress = hm.arl.get(i).patientAddress;
								p2.patientSex = hm.arl.get(i).patientSex;
								p2.patientIllness = hm.arl.get(i).patientIllness;
								p2.amountForAppointment = s.nextFloat();
								p2.joindate = hm.arl.get(i).joindate;
								hm.arl.set(i,p2);
								System.out.println("Patient details updated !!!");
								break;
								default:
								System.out.println("Invalid choice.");
								break;
							}
						}
					} 
							System.out.println("Do you want to continue updating (y/n):");
							l=s.next().charAt(0);
							
				}while(l=='y'); 
		}

	public void showPatientDetails() throws IOException
		{
			
			
			FileWriter myFile3= new FileWriter("C:\\Hospital Management\\Filehp2.txt");
			{
				
			
				myFile3.write("patient-ID \t Patient-Name \t Address \t\tAge \tSex \t Illness \t Consultation Fees \t\tJoin-date\t\t  Medicine needed\n");
				for(int i=0; i<hm.arl.size(); i++)
					{
						String abc=hm.arl.get(i).patientID + "\t\t  "+hm.arl.get(i).patientName+"\t\t "+hm.arl.get(i).patientAddress+" \t"+hm.arl.get(i).age+"\t"+hm.arl.get(i).patientSex+"\t"+hm.arl.get(i).patientIllness+"\t\t"+hm.arl.get(i).amountForAppointment+"\t\t\t"+hm.arl.get(i).joindate+"\t\t"+hm.arl.get(i).medicine;
						myFile3.write(abc);
						myFile3.write("\n");
					}
				myFile3.close();
			}
			
			File myFile4=new File("C:\\Hospital Management\\Filehp2.txt");
			Scanner ab=new Scanner(myFile4);
			while(ab.hasNextLine())
			{
				String data=ab.nextLine();
				System.out.println(data);
			}
			ab.close();
			
		}
	
	public void assignmedicine()
	{
		for (Patient x: hm.arl)
		   {   
			if (x.patientIllness.equals("Bone_Injury"))
			{
				x.medicine="Axiom Capsule , Zenith Capsule";
			}
			
			if (x.patientIllness.equals("Dengue_Fever"))
			{
				x.medicine="Biotrex Carica Papaya , Acetaminophen";
			}
			
			if (x.patientIllness.equals("Heart_Attack"))
			{
				x.medicine="Aspirin , Thrombolytics";
			}
			
			if (x.patientIllness.equals("Alzheimer's "))
			{
				x.medicine="Razadyne , Exelon";
			}
			
			if (x.patientIllness.equals("Skin_Allergy"))
			{
				x.medicine="Hydrocortisone cream , ointments";
			}
			
			if (x.patientIllness.equals("Cataract"))
			{
				x.medicine="Ketorolse , Flogel eyedrop";
			}
			
			}
		System.out.println("Task completed!!");
	}
} 