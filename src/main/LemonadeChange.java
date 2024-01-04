package main;

import java.util.Stack;

public class LemonadeChange {
    class Solution {
        public boolean lemonadeChange(int[] bills) {
            Stack<Integer> stackOf5=new Stack();
            Stack<Integer> stackOf10=new Stack();

            for(int i=0;i<bills.length;i++)
            {
                int input=bills[i];
                if(input==5)
                {
                    stackOf5.push(input);
                }

                else if(input==10)
                {
                    stackOf10.push(input);
                    if(stackOf5.empty())
                        return false;
                    else
                        stackOf5.pop();
                }

                else if(input==20)
                {
                    if(!stackOf10.empty())
                    {
                        stackOf10.pop();
                        if(stackOf5.empty())
                            return false;
                        else
                            stackOf5.pop();
                    }

                    else if(!stackOf5.empty())
                    {
                        for(int j=0;j<3;j++)
                        {
                            if(stackOf5.empty())
                            {
                                return false;
                            }
                            stackOf5.pop();
                        }
                    }

                    else
                    {
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
