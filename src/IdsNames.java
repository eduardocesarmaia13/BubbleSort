/*
The following two arrays have IDs and names:
        ids = {35, 98, 23, 43, 50};
        names = {“John”, “Peter”, “Mariah”, “Bill”, “Chris”};
        The IDs and names are in the respective positions in each array, id number 35 is for John, 98 for Peter, 23 for Mariah, 43 for Bill and 50 for Chris.
        The corresponding IDs and names are in the same position in the array.
        Sort the ids array (and names) in ascending order changing the id value to a new position starting value at 1. Ex:
        {“23 – Mariah”, “35 – John”, “43 – Bill”, “50 – Chris”, “98 - Peter”} sorted
        {“1 – Mariah”, “2 – John”, “3 – Bill”, “4 – Chris”, “5 - Peter”} ids changed to position starting at 1
        However, for even positions the name should be replaced by “N/A”. Expected result is an array like:
        {“1 – Mariah”, “2 – N/A”, “3 – Bill”, “4 – N/A”, “5 - Peter”};
*/

public class IdsNames {
    public static void main(String[] args) {

        int[] ids = {35, 98, 23, 43, 50};
        String[] names = {"John", "Peter", "Mariah", "Bill", "Chris"};

        for(int i = 0; i < ids.length; i++){
            for(int j = 0; j < ids.length -1; j++){
                if(ids[j] > ids[j+1]){

                    int tempId = ids[j];
                    ids[j] = ids[j+1];
                    ids[j+1] = tempId;

                    String tempName = names[j];
                    names[j] = names[j+1];
                    names[j+1] = tempName;

                }
            }
        }
        //for(int i = 0; i < names.length; i++) {
            //System.out.println(ids[i] + " - " + names[i]);
        //}

        for( int i = 0; i < ids.length; i++) {
            if( i % 2 != 0) {
                System.out.println("N/A" + " - " + names[i]);
            }else{
                System.out.println(i+1 + " - " + names[i]);
            }
        }
    }
}