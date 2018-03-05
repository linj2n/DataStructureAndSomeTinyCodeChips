// 请实现一个函数，将一个字符串中的空格替换成“%20”。
// 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
// length为牛客系统规定字符串输出的最大长度，固定为一个常数
class Solution {
public:
    void replaceSpace(char *str,int length) {
        
        if (str == nullptr || length <= 0)
            return ;
        
        int count = 0;
        for (int i = 0; i != length; ++i)
            if(str[i] == ' ') ++count;
        char* fptr = str + length;
        char* lptr = fptr + count * 2;
        
        while (fptr >= str){
            if (*fptr != ' '){
                *lptr-- = *fptr--;
            }else{
                fptr--;
                *lptr-- = '0';
                *lptr-- = '2';
                *lptr-- = '%'; 
            }
        }
        
    }
};