#include <iostream>
#include <cstring>


void showLine(std::string&s){
    for (std::string::iterator it = s.begin() ; it!=s.end() ; ++it)
                    std::cout<<*it;
    std::cout << "\n";
}

void parentheses(std::string &s){
    int first;
    int second;
    while(true){
        first = s.find_first_of("(");
        second = s.find_first_of(")", first + 1);
        std::cout << s.substr(first, second - first + 1) << std::endl;
        s.erase(first, second - first + 1);
    }
    std::cout << "\n";
    showLine(s);
}

void fun2(std::string&s){
    int first, f;
    int second, se;
    std::string s3;
    std::string s2;


    s3 = s;
    s.assign(s3.begin(), s3.end());
       s.resize(s3.size());
       copy(s3.begin(), s3.end(), s.begin());
    showLine(s3);

    while(s.find(" ")){
        first = s.find_first_of(" ");
        second = s.find_first_of(" ", first + 1);
        s2 = s.substr(first, second - first + 1);
       // std::cout << (equal(s2.begin(), s2.end(), s2.rbegin()) ? "yes\n" : "no\n");
        if(equal(s2.begin(), s2.end(), s2.rbegin())){
            f = s3.find_first_of(".?!");
            se = s3.find_first_of(".?!", f + 1);
            std::cout << s3.substr(f + 2, se - f - 2);
        }
       // std::cout << s2 << std::endl;
        s.erase(first, second - first);
    }
    std::cout << "\n";
}

int main()
{
    std::cout << "\n";
    std::string s;
    std::getline(std::cin, s);
   // showLine(s);
    parentheses(s);
    showLine(s);
    //fun2(s);
    return 0;
}

