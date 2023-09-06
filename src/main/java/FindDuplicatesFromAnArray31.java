public class FindDuplicatesFromAnArray31 {
    public static void main(String[] args) {
        String []name={"jaisai","new","jaisai"};


        for (int i=0;i< name.length;i++){
             String currentName=   name[i];
            for (int j =i+1; j < name.length ; j++) {
                if (currentName.equals(name[j])){
                    System.out.println("duplicates are " + name[i]);
                }

            }
        }
    }
}
