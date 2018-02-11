/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* h=head;
        ListNode* curr=head;
        ListNode* leader=head;
        if(head==NULL||head->next==NULL){
            return NULL;
        }
        for(int i=0;i<=n-1;i++){
            leader = leader->next;
        }
        if(leader==NULL){
            return h->next;
        }
        while(leader->next!=NULL){
         curr=curr->next;
         leader=leader->next;
        }
        curr->next=curr->next->next;
        return h;
    }
};
