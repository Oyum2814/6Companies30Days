// Q1
// Runtime (10 ms) Beats 79.10%
// Memory (11.8 MB) Beats 98.34%
class Solution 
{
public:
  int evalRPN(vector<string>& tokens) 
  {
    std::stack<int> stack;

    for (const std::string& token : tokens) 
    {
        if (token == "+") 
        {
            int b = stack.top();
            stack.pop();
            int a = stack.top();
            stack.pop();
            stack.push(a + b);
        } 
        else if (token == "-") 
        {
            int b = stack.top();
            stack.pop();
            int a = stack.top();
            stack.pop();
            stack.push(a - b);
        } 
        else if (token == "*") 
        {
            int b = stack.top();
            stack.pop();
            int a = stack.top();
            stack.pop();
            stack.push(a * b);
        } 
        else if (token == "/") 
        {
            int b = stack.top();
            stack.pop();
            int a = stack.top();
            stack.pop();
            stack.push(a / b);
        } 
        else 
        {
            stack.push(stoi(token));
        }
    }

    return stack.top();
  }
};
