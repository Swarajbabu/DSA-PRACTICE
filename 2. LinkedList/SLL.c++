#include<iostream>
#include <bits/stdc++.h>
using namespace std;


// Singly Linked List Implementation in C++
// Time Complexity: O(n) for traversing the list 
class Node{
    public:
        int data;
        Node* next;
        
        Node(int value){
            data = value;
            next = NULL;
        }
};

int main(){
    Node* first = new Node(10);
    Node* second = new Node(20);
    Node* third = new Node(30);
    
    Node* head = first;
    
    first->next = second;
    second->next = third;
    
    Node* temp = head;
    while(temp!=NULL){
        cout << temp->data<<" ";
        temp = temp->next;
    }
}
// Output: 10 20 30