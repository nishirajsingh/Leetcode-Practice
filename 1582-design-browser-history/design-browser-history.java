class BrowserHistory {
    class Node{
        String url;
        Node prev;
        Node next;
        Node(String url){
            this.url = url;
            this.prev = this.next = null;
        }
    }
    Node temp;
    public BrowserHistory(String homepage) {
        temp = new Node(homepage);
    }
    
    public void visit(String url) {
        Node newNode = new Node(url);
        temp.next = newNode;
        newNode.prev = temp;
        temp  = newNode;
    }
    
    public String back(int steps) {
        while(steps>0 && temp.prev!=null){
            temp = temp.prev;
            steps--;
        }
        return temp.url;
    }
    
    public String forward(int steps) {
        while(steps>0 && temp.next!=null){
            temp = temp.next;
            steps--;
        }
        return temp.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */