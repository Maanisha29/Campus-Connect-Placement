#include<stdio.h>
#include<iostream>
#include<stdlib.h>
using namespace std;
class abc
{
    public:
    void operations(int a,int b)
    {
        cout<<a+b<<std::endl;
    }
};
class abcd 
{
    public:
    void operation(int a,int b)
    {
        cout<<a-b<<std::endl;
    }
};
class abcs : public abcd, public abc
{
    public:
    void operate(int a,int b)
    {
        cout<<a*b<<std::endl;
    }
};
int main()
{
    abcs it;
    it.operations(5,6);
    it.operation(15,17);
    it.operate(2,3);
}