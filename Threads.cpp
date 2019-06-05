#include <iostream>
#include <thread>

void thread_function()
{
    int x = 9;
    std::thread threadObj([]{
        for(int i = 0; i < 10; i++)
            std::cout<<"Display thread_function"<<std::endl;
    });

    for(int i = 0; i < 10; i++)
        std::cout<<"Display From thread_function"<<std::endl;

    threadObj.join();
    std::cout<<"Exiting from thread_function"<<std::endl;
}


int main()
{
    std::thread t(&thread_function);
    std::cout << "main thread\n";
    t.join();
    return 0;
}
