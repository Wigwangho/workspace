        class DiceGame {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int p = 0;
        int q = 0;
        int r = 0;
        boolean abcd = (a==b&&b==c&&c==d);
        boolean abc = (a==b&&b==c);
        boolean bcd = (b==c&&c==d);
        boolean abd = (a==b&&b==d);
        boolean acd = (a==c&&c==d);
        boolean ab = (a==b);
        boolean ac = (a==c);
        boolean ad = (a==d);
        boolean bc = (b==c);
        boolean bd = (b==d);
        boolean cd = (c==d);
        if (abcd){
            p = a;
            answer = p*1111;
        }
        else if(abc){
            p = a;
            q = d;
            answer = ((10*p)+q)*((10*p)+q);
        }
        else if(abd){
            p = a;
            q = c;
            answer = ((10*p)+q)*((10*p)+q);
        }        
        else if(acd){
            p = a;
            q = b;
            answer = ((10*p)+q)*((10*p)+q);
        }
        else if(bcd){
            p = b;
            q = a;
            answer = ((10*p)+q)*((10*p)+q);
        }
        else if(ab&&cd){

            p = b;
            q = d;
            r = p-q;
            answer = (p+q)*Math.abs(r);
        }
        else if(ac&&bd){
            p = a;
            q = b;
            r = p-q;
            answer = (p+q)*Math.abs(r);
        }
        else if (ab){
            p = a;
            q = c;
            r = d;
            answer = q*r;
                
        }

        else if (bc){
            p = b;
            q = a;
            r = d;
            answer = q*r;
                
        }
        else if (ac){
            p = a;
            q = b;
            r = d;
            answer = q*r;
                
        }
        else if (ad){
            p = a;
            q = b;
            r = c;
            answer = q*r;
                
        }
        else if (bd){
            p = b;
            q = a;
            r = c;
            answer = q*r;
                
        }
        else if (cd){
            p = c;
            q = a;
            r = b;
            answer = q*r;
                
        }
        else{
            p = Math.min(a,b);
            q = Math.min(p,c);
            r = Math.min(q,d);
            answer = r;
        }
        
        
        return answer;
    }
}
