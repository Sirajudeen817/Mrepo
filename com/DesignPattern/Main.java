package com.DesignPattern;

import com.Proxy.NetBanking;
import com.Proxy.Payment;
import com.Proxy.UpiPayment;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Video youtubehd=new Youtube(new HDProcessing());
//		youtubehd.playVideo();
//		
//		Video youtube4k=new Youtube(new FourKProcessing());
//		youtube4k.playVideo();
//  
//		Video primehd=new Prime(new HDProcessing());
//		primehd.playVideo();
//		
//		Video prime4k=new Prime(new FourKProcessing());
//		prime4k.playVideo();
		
		Payment nb=new NetBanking();
		nb.pay(4000);
		
		Payment upi=new UpiPayment();
		upi.pay(7000);

	}

}
