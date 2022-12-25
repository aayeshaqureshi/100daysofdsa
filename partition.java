 class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode before_list= new ListNode(0);//dummy node
        ListNode before= before_list;//tail variable to add elements at the end of the list
        ListNode after_list= new ListNode(0);
        ListNode after= after_list;
        //traverse the linked list
        while(head!= null){
            if(head.val<x){
                before.next= head;
                before= before.next;
            }
            else{
                after.next=head;
                after= after.next;
            }
            head= head.next;
        }
        after.next=null;
        before.next= after_list.next;

        return before_list.next;



        
    }
}