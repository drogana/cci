#include "linkedList.h"

linkedList::linkedList(int t){
    cout << "before everything" << endl;
    printf("Start is at %p", start);
    start->data = t;
    cout << "data = t" << endl;
    start->next = nullptr;
    cout << "its a 0" << endl;
    s = 0;
}

void linkedList::insert(int t){
    node *newNode = new node;
    newNode->data = t;
    newNode->next = nullptr;
    node *traverse = start;
    while(traverse->next != nullptr){
        traverse = traverse->next;
    }
    traverse->next = newNode;
}

void linkedList::prnt(){
    node *traverse = start;
    while(traverse->next != nullptr){
        cout << traverse->data;
        traverse = traverse->next;
    }
    cout << traverse->data << endl;
}

void linkedList::removeDups(){
    node *traverse = start;
    while(traverse->next != nullptr){
        node *innerTraverse = traverse->next;
        while(innerTraverse->next != nullptr){
            if(traverse->data == innerTraverse->data){
                traverse->next = traverse->next->next;
            }
            if(traverse->next->next == nullptr && traverse->next->data == innerTraverse->data){
                traverse->next = nullptr;
            }
            innerTraverse = innerTraverse->next;
        }
        if(traverse->next != nullptr){
            traverse = traverse->next;
        }
    }
}