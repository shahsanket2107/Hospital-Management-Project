package hospital_process;
import hospital_management.*;

import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;

public class HospitalProcess 
{
    public static  ArrayList<Patient> arl  = new ArrayList<Patient>();
    public static ArrayList<Doctor> ar2  = new ArrayList<Doctor>();
    public static String joindate;
    
    public static void main(String[] args) throws IOException 
        {
            char l;
            int ch;
            Calendar currentDate = Calendar.getInstance();
            SimpleDateFormat formatter= new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");
            joindate = formatter.format(currentDate.getTime());
            Scanner sc= new Scanner(System.in);
            Patient p1 = new Patient(1,"Tony", "Paldi,Ahmedabad", 20, 'm', "Dengue_Fever", 700f, joindate);
            arl.add(p1);
            Patient p2 = new Patient(2,"Priya", "Satellite,Ahmedabad", 18, 'f', "Bone_Injury", 3500f, joindate);
            arl.add(p2);
            Patient p3 = new Patient(3,"Steve", "Thaltej,Ahmedabad", 59, 'm', "Heart_Attack", 50000f, joindate);
            arl.add(p3);
            Patient p4 = new Patient(4,"Wade", "Iscon,Ahmedabad", 33, 'm', "Skin_Allergy", 2000f, joindate);
            arl.add(p4);
            Patient p5 = new Patient(5,"Missy", "Thaltej,Ahmedabad", 40, 'f', "Alzheimer's ", 10000f, joindate);
            arl.add(p5);
            Doctor d1=new Doctor(1,"Dr. Strange",33,'m',"Surgeon");
            ar2.add(d1);
            Doctor d2=new Doctor(2,"Dr. Who",77,'m',"Physician");
            ar2.add(d2);
            Doctor d3=new Doctor(3,"Dr.Jones",28,'f',"Orthopedist");
            ar2.add(d3);
            Doctor d4=new Doctor(4,"Dr.Drake",50,'m',"Dermatologist");
            ar2.add(d4);
            Doctor d5=new Doctor(5,"Dr.Jessica",36,'f',"Neurologist");
            ar2.add(d5);
            
            System.out.println("\n\n\t\t\t\t\tCARE AND CURE HOSPITAL\n\n\n");
            
            do
                {
                    System.out.println("Enter 1 for patient details, 2 for doctor details and 0 to exit:");
                    ch=sc.nextInt();
                    switch(ch)
                        {
                        case 1:

                            do
                            {
                            Patient p = new Patient();
                            
                            System.out.println("Enter 1 to register a Patient \n 2 to update Patient details \n 3 to remove Patient \n 4 to assign medicine to Patient\n 5 to display Patient details");
                            
                            int choice = sc.nextInt();
                            switch(choice)
                                {
                                    case 1:
									try {
										p.registerPatient();
									} 
									catch (Exception e) {
										System.out.println("This is invalid :"+e);
										e.printStackTrace();
									}
                                    System.out.println("Patient Registered Successfully !!!");
                                    p.showPatientDetails();
                                    break;
                                    
                                    case 2:
                                    p.showPatientDetails();
									try {
										p.updatePatientDetails();
									} 
									catch (Exception e) {
										System.out.println("This is invalid :"+e);
										e.printStackTrace();
									}
                                    break;
                                    
                                    case 3:
									try {
										p.removePatient();
									} 
									catch (Exception e) {
										System.out.println("This is invalid :"+e);
										e.printStackTrace();
									}
                                    break;
                                    
                                    case 4:
    									try {
    										p.assignmedicine();
    									} 
    									catch (Exception e) {
    										System.out.println("This is invalid :"+e);
    										e.printStackTrace();
    									}
                                        break;
                                        
                                    case 5:
                                    p.showPatientDetails();
                                    break;
                                    
                                    default:          
                                    System.out.println("Try again");
                                    break;
                                }
                            System.out.println("Do you want to continue selecting options (y/n):");
                            l=sc.next().charAt(0);

                            }while(l=='y');

                        break;

                        case 2:

                            do
                            {
                            Doctor d=new Doctor();

                            System.out.println("Enter 1 to register a Doctor  \n 2 to remove Doctor \n 3 to display Doctor details \n 4 to assign patient to Doctor");

                            int choice = sc.nextInt();
                            switch(choice)
                                {
                                    case 1:
									try {
										d.registerDoctor();
									} 
									catch (Exception e) {
										System.out.println("This is invalid :"+e);
										e.printStackTrace();
									}
                                    System.out.println("Doctor Registered Successfully !!!");
                                    d.showDoctorDetails();
                                    break;

                                    case 2:
									try {
										d.removeDoctor();
									} 
									catch (Exception e) {
										System.out.println("This is invalid :"+e);
										e.printStackTrace();
									}
                                    break;

                                    case 3:
                                    d.showDoctorDetails();
                                    break;
                                    
                                    case 4:
									try {
										d.assignDoctor();
										System.out.println("Task completed");
									} 
									catch (Exception e) {
										System.out.println("This is invalid :"+e);
										e.printStackTrace();
									}
								break;

                                    default:
                                    System.out.println("Try again");
                                    break;
                                }

                            System.out.println("Do you want to continue selecting options (y/n):");
                            l=sc.next().charAt(0);

                            }while(l=='y');

                        break;

                        case 0:

                            break;

                        default:

                            System.out.println("Invalid choice!");
                            break;
                        }

                }while(ch!=0);

        }
} 
