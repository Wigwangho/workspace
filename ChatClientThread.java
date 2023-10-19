package achat.step1;

import java.util.StringTokenizer;
import java.util.Vector;

//서버가 한 말을 듣는 클래스 설계임
public class ChatClientThread extends Thread {
	ChatClient cc = null;//클라이언트가 한 말은 cc 객체에 기록된다
	public ChatClientThread(ChatClient cc) {
		//아래 초기화를 생략하면 ChatClientThread클래스안에서 ChatClient
		//의 변수나 메소드를 호출할 때 NullPointerException발동
		this.cc = cc;//초기화가 필요한 이유는?
    //그냥 인스턴스화해서 전역변수로 부르면 안될까?
	}
	//서버에서 말한 내용을 들어봅시다.
	//말하기는 ChatClient 의 actionPerformed에서 JTextField에 엔터 쳤을 때 처리합니다.
	public void run() {
		boolean isStop = false;
		start:
		while(!isStop) {
			try {
				String msg = "";
				msg = (String)cc.ois.readObject();
				StringTokenizer st = null;
				int protocol = 0;//100|200|500(나가기)
        //클릭 버튼에 따라 다른 프로토콜이 진행된다
				if(msg !=null) {
					st = new StringTokenizer(msg,"|");
					protocol = Integer.parseInt(st.nextToken());//100
				}
				switch(protocol) {
					case 100: {// 100|kiwi - 입장하기 처리
						String nickName = st.nextToken();//kiwi
						cc.jta_display.append(nickName+"님이 입장하였습니다.\n");//서버에 입장한 인물의 닉네임을 메세지 나눔에 알리기
						Vector<String> v = new Vector<>();
						v.add(nickName);
						cc.dtm.addRow(v);
					}break;
					case 200:{//다자간 대화 처리 - 청취하기 - 서버에서 보낸 메세지를 듣는곳
            //메세지와 발신자의 닉네임을 저장
						String nickName = st.nextToken();
						String message = st.nextToken();
						cc.jta_display.append("["+nickName+"] "+message+"\n");
						cc.jta_display.setCaretPosition(cc.jta_display.getDocument().getLength());
					}break;
					case 500:{//나가기 처리
						//아직 코드 완성되지 않음
            //대상 클라이언트를 서버에서 제거하고, "~님이 서버에서 나갔습니다" 를 표출
					}break start;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
