public class DIYLinkedListTester{



    public static void main (String[] args){


        DIYLinkedList kist = new DIYLinkedList();//Kathryn + list = kist. Also just a typo

        //Test both adds

        //append
        kist.add(1);
        kist.add(2);
        kist.add(3);
        System.out.println(kist);

        //add at beginning
        kist.add(0, 1000);
        System.out.println(kist);

        //add at random index

        kist.add(2, 4);
        System.out.println(kist);

        //add at end
        kist.add(kist.size(), 0);//not size -1 because # indexes will +1 once you add the last element, an
        System.out.println(kist);

        //add at index that doesnt exist, should not do anything, would give a index out of bounds normally but i dont feel like it
        kist.add(100, 0);
        System.out.println(kist);

        //remove

        //remove from random index
        kist.remove(1);
        System.out.println(kist);

        //remove  from beginning
        kist.remove(0);
        System.out.println(kist);

        //remove from end
        kist.remove(kist.size()-1);
        System.out.println(kist);

        //remove from out of bounds place, shouldnt do anything
        kist.remove(100);
        System.out.println(kist);

        //size
        System.out.println(kist.size());

        //test get from beginning and end
        System.out.println(kist.get(kist.size()-1));
        System.out.println(kist.get(0));

   

        //indexOf
        System.out.println(kist.indexOf(4));
        System.out.println(kist.indexOf(3));
        System.out.println(kist.indexOf(400)); //should be -1


        //addSorted (not tested thoroughly)

        kist.addSorted(100000);
        System.out.println(kist);

        




    }
}