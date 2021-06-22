package com.mx.interview.question15;

import java.util.Set;
import java.util.TreeSet;

public class StringConstruction {

	public static void main(String[] args) {

		String s = "obgtmuvrmbobvngeirabdienmrdljmobrnmmbudq"
				+ "dcpqmudrojngsidsscmesuerldmqpvmfroalitjfluihmcpt"
				+ "keqvmnqpnubgujgiinbhpalisiconatmuahpikevvllouocaanmjr"
				+ "sbticrhbchebededplcajqismnmqkttcoohdifljshiufncdkflbbeaqjsk"
				+ "rqogmqrkmhatmkcttpmqhtdmmmvispkakoecddioldbpjcadplieqvpgogi"
				+ "kvikepajtrcsqhmgnguuevosgludqvlnetkkojepuprnpvjqekoprhlepibnes"
				+ "efdempqlpqfsrlvnmeimdbpedlcdoekkftuunenutkjrerdhjltebfsfdnbqoat"
				+ "snaecrntkvaofiqnptkiurcjledesdugfmgosdmdvjceedcsrrfiorfjulcigbrllr"
				+ "kfmdikvcckurhdlvbtsapisrqihcalfmobbvvgjeolppvskfkhdihglvdjnitlvqbvb"
				+ "icejgqhfjebauurjsjgkqgqttffakuvqiusftdogignjshrtdahtaoaetglrtlphskuech"
				+ "dajqjubgbtvejaudfaiooaktgccaqlirmomefigvklofagsgbhqjjkitgncjokcegoslef"
				+ "lbfmopfkjovjhvgsobudibmgfvbclprkrrouvrjhnnq"
				+ "gntnnhlmqcageubdflqisnmbnlnklridtpfnfurgikqotaenjsufqsrdtkbfjqulsbavlgnnkrgckericfrrogeg";
		
		
		String t ="ifgrhioapmrlpqecblnlgcelrqlngbskgijpbklprbqlllalajqdbeikdslmlscmlrediofrfhonopmgnebqfglihcboobfgdpiobsmambjicrqqgarkkgonhesmcndjhhljfepskrenaislplrijcslmjrdhgfdbdalbpprjecloblaadrrksbbbfkmcjbsqkphgrdfhiddmaeppmomnhpiahjnplliqjjbbknphmmnngjlejqplenrkrmrbbrbjasabcfpmffsdfaejqerqdfmpendlqokomemmolebrkdplpbihqpjjnabajipgjgqebambebgikarkfgphddbhbjaigcakigsininqrbgjmjmdgasaeiksgnieopfkhmhspioqsoahrihfmmnnjghfqceoiehoabfpsdsiclcbrqldsbcqrbnqpjlphofslhiokjmsrqdglgjabfeailiamhkcokkmrlscdrkirijqlsjqbiapeofdljgqiqnhejicmjbkhpjgpdocmajfrdfrrdlkokpkflroppiqmbfapmqrrscpsqdhknbhrrbpianjoclqkaijjfnmlfdsemincjjlflmdklipinbklpprjkddhmmmepabmhokbjdjsiggcassqnjsqoeeiircikafeoppoojrhgdbhseeleinkcbemojaoellglkiqefignmpjqsfoimesoespfqqqpllresrcolhsqssbscalhndgkrfqqnhcrescgleifirsqhqmkqiafndckmbsisgippbiedaidjlmcfkmbscidsoblnsobjmdkaejphikbgmprhafogllqopicegsfggrodbsjgaldndfpefbmdgppobiplkikmdhdlraogjlneiogpqkekjmasnncjgsicgibmerq";
		
		String a="abab";
		

		int r = StringConstruction.stringConstruction(a);

		System.out.println(r);

	}

	public static int stringConstruction(String s) {
		// Write your code here
		int r=0;

		
		// Create a set because set not allow duplicate
		Set<String> set = new TreeSet<String>();

		// Loop the String and get each letter
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			String d = String.valueOf(c);			
			set.add(d);
		}

		r=set.size();
		return r; 

	}

}
