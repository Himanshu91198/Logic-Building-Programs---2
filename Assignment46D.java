///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// write a java program which accept marks of N students from user and display calss of each student.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.*;

class Assignment46D {
    public static void main(String Arg[]) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of students : ");
        int Size = sobj.nextInt();

        float Arr[] = new float[Size];

        System.out.println("Enter the marks : ");

        for(int i = 0;i < Arr.length;i++)
        {
            Arr[i] = sobj.nextFloat();
        }

        MyArray obj = new MyArray();

        obj.Percentage(Arr);

        sobj.close();
    }
}

class MyArray {
    public void Percentage(float Arr[]) {
        for(int i = 0;i < Arr.length;i++)
        {
            if(Arr[i] < 35)
            {
                System.out.println("Student with marks " +Arr[i]+ " has failed");
            }
            else if(Arr[i] < 50 && Arr[i] >35)
            {
                System.out.println("Student with marks " +Arr[i]+ " has passed with Pass class");
            }
            else if(Arr[i] < 60 && Arr[i] > 50)
            {
                System.out.println("Student with marks " +Arr[i]+ " has passed with Second class");
            }
            else if(Arr[i] < 70 && Arr[i] > 60)
            {
                System.out.println("Student with marks " +Arr[i]+ " has passed with First class");
            }
            else if(Arr[i] > 70)
            {
                System.out.println("Student with marks " +Arr[i]+ " has passed with First class with destinction");
            }
            else if(Arr[i] < 0 && Arr[i] > 100)
            {
                System.out.println("Invalid Marks");
            }
        }
    }
}