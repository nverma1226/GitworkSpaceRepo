import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExFinder {
	public static final String EXAMPLE_TEST = "This is my small example string which I'm going to use for pattern matching.";
	public static String s;

	
	public static void main(String[] args) {
 s="<Request>Neeraj1 code_string=ea0e519b6088baddefe899ec789eab8e&encpwdsfx=&TPMDATA=''&TRAIN=array('TRAINNO'=>9,'CAR11'=>array('incfile'=>'https://35.203.174.67/suite/mod/dia02.m039/f1f1.pip','pagepath'=>'/suite/mod/dia02.m039/f1f1.html','TRAPOST'=>'array(\\'act\\'=>\\'refresh\\',\\'count\\'=>20,\\'kcount\\'=>0,\\'oldlist\\'=>0,\\'search\\'=>\\'\\',\\'sort\\'=>\\'#Patient\\',\\'rep_id\\'=>0,\\'print_view\\'=>\\'DIA01_FULL_VIEW_NORPTLAB\\',\\'where\\'=>\\' AND RV.REPORTED BETWEEN GetDateRange(\\\\\\'from01/01/2008!!02/28/2018\\\\\\') AND GetDateRange(\\\\\\'from01/01/2008!!02/28/2018\\\\\\',1) AND RV.LAB_REPORT_ID LIKE /**/\\\\\\'%254MD0509606323_0006707%25\\\\\\' AND ( RV.CAB_CODE=/**/\\\\\\'RC19346\\\\\\' OR RV.CAB_CODE=\\\\\\'*\\\\\\' )\\',\\'sce_code\\'=>\\'\\',\\'time_diff\\'=>\\'0\\',\\'PM_ENABLED\\'=>0,\\'whereparm\\'=>array(\\'show\\'=>\\'FLT_ALL_REPORTS\\',\\'physicians\\'=>\\'\\',\\'datetype\\'=>\\'r\\',\\'daterange\\'=>\\'from01/01/2008!!02/28/2018\\',\\'sources\\'=>\\'\\',\\'patient\\'=>\\'\\',\\'searchfld\\'=>\\'LAB_REPORT_ID\\',\\'searchval\\'=>\\'%254MD0509606323_0006707%25\\',\\'cab_code\\'=>\\'RC19346\\'),\\'total\\'=>1)'),'CAR1'=>array('incfile'=>'https://35.203.174.67/suite/ctl/ctl.pip','pagepath'=>'/home/extjs4/desktop/index.html','TRAPOST'=>'array(\\'phpaction\\'=>\\'PUT_LOG\\',\\'PUT_QUE\\'=>array(array(\\'act\\'=>7,\\'svc\\'=>\\'\\',\\'dst\\'=>\\'\\',\\'cab\\'=>\\'RC19346\\',\\'rep\\'=>\\'\\',\\'ord\\'=>\\'\\',\\'pch\\'=>\\'\\',\\'phy\\'=>\\'\\',\\'txt\\'=>\\'%254MD0509606323_0006707%25\\',\\'mod\\'=>\\'GL_DIA02\\')))')) </Request><Request> Neeraj2 code_string=63b550507fca4cb50f5bb4ec79ff1bc9&encpwdsfx=&TPMDATA=''&TRAIN=array('TRAINNO'=>9,'CAR11'=>array('incfile'=>'https://35.203.174.67/suite/mod/dia02.m039/f1f1.pip','pagepath'=>'/suite/mod/dia02.m039/f1f1.html','TRAPOST'=>'array(\\'act\\'=>\\'refresh\\',\\'count\\'=>20,\\'kcount\\'=>0,\\'oldlist\\'=>0,\\'search\\'=>\\'\\',\\'sort\\'=>\\'#Patient\\',\\'rep_id\\'=>0,\\'print_view\\'=>\\'DIA01_FULL_VIEW_NORPTLAB\\',\\'where\\'=>\\' AND RV.REPORTED BETWEEN GetDateRange(\\\\\\'from01/01/2008!!02/28/2018\\\\\\') AND GetDateRange(\\\\\\'from01/01/2008!!02/28/2018\\\\\\',1) AND RV.LAB_REPORT_ID LIKE /**/\\\\\\'%25GRN02590359%25\\\\\\' AND ( RV.CAB_CODE=/**/\\\\\\'RC16258\\\\\\' OR RV.CAB_CODE=\\\\\\'*\\\\\\' )\\',\\'sce_code\\'=>\\'\\',\\'time_diff\\'=>\\'0\\',\\'PM_ENABLED\\'=>0,\\'whereparm\\'=>array(\\'show\\'=>\\'FLT_ALL_REPORTS\\',\\'physicians\\'=>\\'\\',\\'datetype\\'=>\\'r\\',\\'daterange\\'=>\\'from01/01/2008!!02/28/2018\\',\\'sources\\'=>\\'\\',\\'patient\\'=>\\'\\',\\'searchfld\\'=>\\'LAB_REPORT_ID\\',\\'searchval\\'=>\\'%25GRN02590359%25\\',\\'cab_code\\'=>\\'RC16258\\'),\\'total\\'=>1)'),'CAR1'=>array('incfile'=>'https://35.203.174.67/suite/ctl/ctl.pip','pagepath'=>'/home/extjs4/desktop/index.html','TRAPOST'=>'array(\\'phpaction\\'=>\\'PUT_LOG\\',\\'PUT_QUE\\'=>array(array(\\'act\\'=>7,\\'svc\\'=>\\'\\',\\'dst\\'=>\\'\\',\\'cab\\'=>\\'RC16258\\',\\'rep\\'=>\\'\\',\\'ord\\'=>\\'\\',\\'pch\\'=>\\'\\',\\'phy\\'=>\\'\\',\\'txt\\'=>\\'%25GRN02590359%25\\',\\'mod\\'=>\\'GL_DIA02\\')))')) </Request>";

Pattern p = Pattern.compile("(<Request>)(.*?)(code_string)(.*?)(</Request>)");
Matcher m = p.matcher(s);
m.reset();//required to reset the state of the matcher
m.groupCount();
while(m.find()){
	System.out.println(m.group());
	System.out.println(m.group(3));
	System.out.println(m.group(1));
	System.out.println(m.group(2));

}



}
	


}
