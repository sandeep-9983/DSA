class Solution {
    public int calPoints(String[] operations) {
        int total=0;
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("+")){
                int top1=s.peek();
                s.pop();
                int top2=s.peek();
                s.push(top1);
                s.push(top1+top2); 
        } else if(operations[i].equals("D")){
            int val=s.peek();
            s.push(val*2);

        } else if(operations[i].equals("C")){
            s.pop();
        }else{
            s.push(Integer.parseInt(operations[i]));
        }
        }
        while(!s.isEmpty()){
            total+=s.peek();
            s.pop();
        }
        return total;

    }
}