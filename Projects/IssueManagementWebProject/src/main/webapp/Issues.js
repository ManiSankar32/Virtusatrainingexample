
var issue_arr = new Array("Payment Issues", "Food Issues", "Application Issues", "General Issues", "Order Issues","Other Issues");

var s_a = new Array();
s_a[0]="";
s_a[1]="Money Deducted But Order Not Placed|Why Was my Payment Rejected|How to add My credit Card|Insufficient Funds|Issuer or Cardholder restriction|Declined|Transaction Not allowed";
s_a[2]="Food is Tasteless change the restaurant|food which i ordered is wasted because it is Incorrectly cooked|Food become bad smell due to delay|Food items are missing in my order|The quantity of food is not adequate";
s_a[3]="Your Application is Hanging|Some one got hacked the application in my mobile|Location is Not working Properly|Nearby Restaurants are not visible in your application|Some Options are missing";
s_a[4]="I have Coupon related issues|Coupons are Not Working|Your Employees behavoiur is Not Good|Some Nearby Restaurants are showing high costs|Your Delivery Is So Slow";
s_a[5]="I haven't received my last Order|Order is Not Valid error|How can i delete my Orders|Order canceled but not refunded|My Order Was Not Packed Perfectly";

function populateOtherissues(otherid){
	
	var val = document.getElementById( otherid );
	
	
	if(val=='Other Issues')
       element.style.display='block';

}
function populateSubissues( Mainissue, subissue ){
	
	var MainissueIndex = document.getElementById( Mainissue ).selectedIndex;

	var subissueEle = document.getElementById( subissue );
	
	subissueEle.length=0;	
	subissueEle.options[0] = new Option('Select Issue','');
	subissueEle.selectedIndex = 0;
	
	var subissue_arr = s_a[MainissueIndex].split("|");
	
	for (var i=0; i<subissue_arr.length; i++) {
		subissueEle.options[subissueEle.length] = new Option(subissue_arr[i],subissue_arr[i]);
	}
}

function populateIssues(Mainissueid, subissueid){
	// given the id of the <select> tag as function argument, it inserts <option> tags
	var issueElement = document.getElementById(Mainissueid);
	issueElement.length=0;
	issueElement.options[0] = new Option('Select Main Issue','-1');
	issueElement.selectedIndex = 0;
	for (var i=0; i<issue_arr.length; i++) {
		issueElement.options[issueElement.length] = new Option(issue_arr[i],issue_arr[i]);
	}


	if( subissueid=="Other Issues" ){
		issueElement.onchange = function(){
			populateOtherissues( Mainissueid);
		};
	}
	else if( subissueid ){
		issueElement.onchange = function(){
			populateSubissues( Mainissueid, subissueid );
		};
	}
}