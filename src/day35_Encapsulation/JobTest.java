package day35_Encapsulation;

import java.util.ArrayList;

public class JobTest {

	public static void main(String[] args) {
		
		Job job1=new Job();   //invoke constructor, and inside constructor has print statement
		Job job2=new Job("java developer");  //invoke constructor, and inside constructor has print statement
		Job job3=new Job("SDET", "Amazon", 130000); //invoke constructor, and inside constructor has print statement
		
		System.out.println(job1.toString());
		System.out.println(job2.toString());
		System.out.println(job3.toString());
		
		// create a list of jobs
		// add 5 different jobs with company salary title
		
		ArrayList<Job> jobList=new ArrayList<>();
		
		jobList.add(job3);
		jobList.add(new Job("SM","abc",90000));
		jobList.add(new Job("BA","xxx",98000));
		jobList.add(new Job("FT","kkk",100000));
		
		System.out.println(jobList.toString());
		
		// find the highest paying job and print it
		
		double maxSalary=0;
		int highestIndex=0;
		
		for(int i=0;i<jobList.size();i++) {
			if(jobList.get(i).getAnnualSalary()>maxSalary) {
				maxSalary=jobList.get(i).getAnnualSalary();
				highestIndex=i;  // which index has the highest value
				
			}
		}
		
System.out.println(jobList.get(highestIndex).getAnnualSalary());
	}

}
