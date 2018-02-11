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
    ListNode* reverseList(ListNode* head ) {
        if (head==NULL || head->next==NULL){
            return head;
        }
        if (head->next->next==NULL){
            ListNode* toReturn=head->next;
            head->next->next=head;
            head->next=NULL;
            return toReturn;
        }
        else{
            ListNode* h=head;
            ListNode* h0=head;
            ListNode* h1=head->next;
            ListNode* h2=head->next->next;
            while(h2->next!=NULL){
                h1->next = h0;
                h0=h1;
                h1=h2;
                h2=h2->next;
            }
            h2->next=h1;
            h1->next=h0;
            h->next=NULL;
            return h2;
        }
    }
};
