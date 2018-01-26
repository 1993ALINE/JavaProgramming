public class ArrayExample {
        public static void main(String[] args) {
            String[] my_array = new String[5];
            String[] my_students = {"Aline","Hridoy","Sanim","Xihan","Rimon","Rafi"};
            my_array[0] = "Iron Man";
            System.out.println(my_array[0]);
            int size_of_array = my_students.length;
            System.out.println("Size of the 'my_student' array is : "+size_of_array);
            for (int i = 0; i < size_of_array; i++){
                System.out.println("Name of student is : "+my_students[i]);
            }

        }
    }


