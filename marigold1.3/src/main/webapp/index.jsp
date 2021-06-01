<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제품 검색</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<script>
	$(document).ready(function(){
		$(".S").hide();
		$("input:radio[name='secondCategory']").change(function(){
			if($("input:radio[name='secondCategory']:checked").val() == "S"){
				$(".tc").show();
			} else{
				$(".tc").hide();
			}
		});
		$("#1").change(function(){
			if($("#1").is(":checked")){
				$(".1").show();
			} else{
				$(".1").hide();
			}
		})
		$("#2").change(function(){
			if($("#2").is(":checked")){
				$(".2").show();
			} else{
				$(".2").hide();
			}
		})
		$("#3").change(function(){
			if($("#3").is(":checked")){
				$(".3").show();
			} else{
				$(".3").hide();
			}
		})
		$("#4").change(function(){
			if($("#4").is(":checked")){
				$(".4").show();
			} else{
				$(".4").hide();
			}
		})
		$("#5").change(function(){
			if($("#5").is(":checked")){
				$(".5").show();
			} else{
				$(".5").hide();
			}
		})
		$("#6").change(function(){
			if($("#6").is(":checked")){
				$(".6").show();
			} else{
				$(".6").hide();
			}
		})
	});
</script>
<style>
body {
	margin: 0 auto;
	width: 90%;
}
form {
    margin:0 auto;
    width: 90%;
}
#checkSubmit{
	text-align: center;
}

</style>
</head>
<body>
	<h1>신발 검색</h1>
	<div id="main">
		<form method="post" action="getSearchListSimilar.do">
			<input type="text" name="searchKeyword" /> <input type="submit" value="검색" /> &nbsp;&nbsp;
			<a href="getList.do">전체상품</a>
		</form>
	</div>
	<br />
	<br />
	
	<div id="container">
		<form method="post" action="getCheckList.do">
			<fieldset id="firstCategory">
				<legend>성별 및 연령</legend>
				<label for="M"><input type="radio" name="firstCategory" id="M" value="M" />남성</label>
				<label for="W"><input type="radio" name="firstCategory" id="W" value="W" />여성</label>
				<label for="U"><input type="radio" name="firstCategory" id="U" value="U" checked="checked" />남녀공용</label>
				<label for="K"><input type="radio" name="firstCategory" id="K" value="K" />키즈</label>
			</fieldset>
			
			<fieldset id="secondCategory">
				<legend>카테고리</legend>
				<label for="S"><input type="radio" name="secondCategory" id="S" value="S" checked="checked" />슈즈</label>
				<label for="C"><input type="radio" name="secondCategory" id="C" value="C" />의류</label>
				<label for="B"><input type="radio" name="secondCategory" id="B" value="B" />가방</label>
				<label for="A"><input type="radio" name="secondCategory" id="A" value="A" />액세서리</label>
			</fieldset>
			
			<fieldset id="thirdCategory">
				<legend>슈즈</legend>
				<label for="1" class="tc"><input type="checkbox" name="thirdCategory" id="1" value="1" />운동화</label>
				<label for="2" class="tc"><input type="checkbox" name="thirdCategory" id="2" value="2" />스포츠</label>
				<label for="3" class="tc"><input type="checkbox" name="thirdCategory" id="3" value="3" />구두</label>
				<label for="4" class="tc"><input type="checkbox" name="thirdCategory" id="4" value="4" />샌들</label>
				<label for="5" class="tc"><input type="checkbox" name="thirdCategory" id="5" value="5" />캐주얼</label>
				<label for="6" class="tc"><input type="checkbox" name="thirdCategory" id="6" value="6" />부츠</label>
				
			</fieldset>

			<fieldset id="fourthCategory">
				<legend>스타일</legend>
				<label for="01" class="S 1"><input type="checkbox" id="01" name="fourthCategory" value="01" />캔버스화</label>
				<label for="02" class="S 1"><input type="checkbox" id="02" name="fourthCategory" value="02" />스니커즈</label>
				<label for="03" class="S 1"><input type="checkbox" id="03" name="fourthCategory" value="03" />슬립온</label>
				<label for="04" class="S 1"><input type="checkbox" id="04" name="fourthCategory" value="04" />어글리슈즈</label>
				<label for="05" class="S 1"><input type="checkbox" id="05" name="fourthCategory" value="05" />커스텀</label>
				
				<label for="06" class="S 2"><input type="checkbox" id="06" name="fourthCategory" value="06" />런닝화</label>
				<label for="07" class="S 2"><input type="checkbox" id="07" name="fourthCategory" value="07" />농구화</label>
				<label for="08" class="S 2"><input type="checkbox" id="08" name="fourthCategory" value="08" />골프화</label>
				<label for="09" class="S 2"><input type="checkbox" id="09" name="fourthCategory" value="09" />등산화</label>
				<label for="10" class="S 2"><input type="checkbox" id="10" name="fourthCategory" value="10" />기능화</label>
				<label for="11" class="S 2"><input type="checkbox" id="11" name="fourthCategory" value="11" />축구화</label>
				
				<label for="12" class="S 3"><input type="checkbox" id="12" name="fourthCategory" value="12" />로퍼/플랫</label>
				<label for="13" class="S 3"><input type="checkbox" id="13" name="fourthCategory" value="13" />힐/펌프스</label>
				<label for="14" class="S 3"><input type="checkbox" id="14" name="fourthCategory" value="14" />슬링백/토오픈</label>
				<label for="15" class="S 3"><input type="checkbox" id="15" name="fourthCategory" value="15" />뮬/블로퍼</label>
				<label for="16" class="S 3"><input type="checkbox" id="16" name="fourthCategory" value="16" />레이스업</label>
				
				<label for="17" class="S 4"><input type="checkbox" id="17" name="fourthCategory" value="17" />슬라이드</label>
				<label for="18" class="S 4"><input type="checkbox" id="18" name="fourthCategory" value="18" />아쿠아슈즈</label>
				<label for="19" class="S 4"><input type="checkbox" id="19" name="fourthCategory" value="19" />스포츠샌들</label>
				<label for="20" class="S 4"><input type="checkbox" id="20" name="fourthCategory" value="20" />코르크샌들</label>
				<label for="21" class="S 4"><input type="checkbox" id="21" name="fourthCategory" value="21" />레더샌들</label>
				<label for="22" class="S 4"><input type="checkbox" id="22" name="fourthCategory" value="22" />드레스샌드</label>
				<label for="23" class="S 4"><input type="checkbox" id="23" name="fourthCategory" value="23" />슬리퍼</label>
				
				<label for="24" class="S 5"><input type="checkbox" id="24" name="fourthCategory" value="24" />워킹슈즈</label>
				
				<label for="25" class="S 6"><input type="checkbox" id="25"  name="fourthCategory" value="25" />워커부츠</label>
				<label for="26" class="S 6"><input type="checkbox" id="26" name="fourthCategory" value="26" />패딩부츠</label>
				<label for="27" class="S 6"><input type="checkbox" id="27"  name="fourthCategory" value="27" />첼시부츠</label>
				<label for="28" class="S 6"><input type="checkbox" id="28"  name="fourthCategory" value="28" />미들부츠</label>
				<label for="29" class="S 6"><input type="checkbox" id="29"  name="fourthCategory" value="29" />롱부츠</label>
				<label for="30" class="S 6"><input type="checkbox" id="30"  name="fourthCategory" value="30" />레인부츠</label>
				<label for="31" class="S 6"><input type="checkbox" id="31"  name="fourthCategory" value="31" />어그부츠</label>
				<label for="32" class="S 6"><input type="checkbox" id="32"  name="fourthCategory" value="32" />앵클부츠</label>
			</fieldset>
			
			<fieldset id="brand">
				<legend>브랜드</legend>
				<label for="001"><input type="checkbox" id="001" name="brand" value="001" />샤넬</label>
				<label for="002"><input type="checkbox" id="002" name="brand" value="002" />셀린느</label>
				<label for="003"><input type="checkbox" id="003" name="brand" value="003" />멀버리</label>
				<label for="004"><input type="checkbox" id="004" name="brand" value="004" />버버리</label>
				<label for="005"><input type="checkbox" id="005" name="brand" value="005" />메종마르지엘라</label>
				<label for="006"><input type="checkbox" id="006" name="brand" value="006" />벨루티</label>
				<label for="007"><input type="checkbox" id="007" name="brand" value="007" />발리</label>
				<label for="008"><input type="checkbox" id="008" name="brand" value="008" />발망</label>
				<label for="009"><input type="checkbox" id="009" name="brand" value="009" />페레가모</label>
				<label for="010"><input type="checkbox" id="010" name="brand" value="010" />루이비통</label>
				
				<label for="011"><input type="checkbox" id="011" name="brand" value="011" />구찌</label>
				<label for="012"><input type="checkbox" id="012" name="brand" value="012" />디올</label>
				<label for="013"><input type="checkbox" id="013" name="brand" value="013" />지방시</label>
				<label for="014"><input type="checkbox" id="014" name="brand" value="014" />빈폴</label>
				<label for="015"><input type="checkbox" id="015" name="brand" value="015" />폴로</label>
				<label for="016"><input type="checkbox" id="016" name="brand" value="016" />랄프로렌</label>
				<label for="017"><input type="checkbox" id="017" name="brand" value="017" />에르메스</label>
				<label for="018"><input type="checkbox" id="018" name="brand" value="018" />로로피아나</label>
				<label for="019"><input type="checkbox" id="019" name="brand" value="019" />쿠치넬리</label>
				<label for="020"><input type="checkbox" id="020" name="brand" value="020" />마이클코어스</label>
				
				<label for="021"><input type="checkbox" id="021" name="brand" value="021" />마크제이콥스</label>
				<label for="022"><input type="checkbox" id="022" name="brand" value="022" />끌로에</label>
				<label for="023"><input type="checkbox" id="023" name="brand" value="023" />프라다</label>
				<label for="024"><input type="checkbox" id="024" name="brand" value="024" />르꼬끄</label>
				<label for="025"><input type="checkbox" id="025" name="brand" value="025" />데상트</label>
				<label for="026"><input type="checkbox" id="026" name="brand" value="026" />컨버스</label>
				<label for="027"><input type="checkbox" id="027" name="brand" value="027" />크록스</label>
				<label for="028"><input type="checkbox" id="028" name="brand" value="028" />라코스테</label>
				<label for="029"><input type="checkbox" id="029" name="brand" value="029" />금강재화</label>
				<label for="030"><input type="checkbox" id="030" name="brand" value="030" />리복</label>
				
				<label for="031"><input type="checkbox" id="031" name="brand" value="031" />아키클래식</label>
				<label for="032"><input type="checkbox" id="032" name="brand" value="032" />캐치볼</label>
				<label for="033"><input type="checkbox" id="033" name="brand" value="033" />닥터마틴</label>
				<label for="034"><input type="checkbox" id="034" name="brand" value="034" />팀버랜드</label>
				<label for="035"><input type="checkbox" id="035" name="brand" value="035" />프레드페리</label>
				<label for="036"><input type="checkbox" id="036" name="brand" value="036" />스케쳐스</label>
				<label for="037"><input type="checkbox" id="037" name="brand" value="037" />푸마</label>
				<label for="038"><input type="checkbox" id="038" name="brand" value="038" />포즈간츠</label>
				<label for="039"><input type="checkbox" id="039" name="brand" value="039" />스테파노로시</label>
				<label for="040"><input type="checkbox" id="040" name="brand" value="040" />마크모크</label>
				
				<label for="041"><input type="checkbox" id="041" name="brand" value="041" />버켄스탁</label>
				<label for="042"><input type="checkbox" id="042" name="brand" value="042" />젝시믹스</label>
				<label for="043"><input type="checkbox" id="043" name="brand" value="043" />포티세컨드</label>
				<label for="044"><input type="checkbox" id="044" name="brand" value="044" />뉴에라</label>
				<label for="045"><input type="checkbox" id="045" name="brand" value="045" />에버레스트</label>
				<label for="046"><input type="checkbox" id="046" name="brand" value="046" />스프리트</label>
				<label for="047"><input type="checkbox" id="047" name="brand" value="047" />써코니</label>
				<label for="048"><input type="checkbox" id="048" name="brand" value="048" />아식스</label>
				<label for="049"><input type="checkbox" id="049" name="brand" value="049" />블랙마틴싯봉</label>
				<label for="050"><input type="checkbox" id="050" name="brand" value="050" />블라도</label>
				
				<label for="051"><input type="checkbox" id="051" name="brand" value="051" />호킨스</label>
				<label for="052"><input type="checkbox" id="052" name="brand" value="052" />무인양품</label>
			</fieldset>
			
			<fieldset id="color">
				<legend>색상 계열</legend>
				<label for="검정"><input type="checkbox" id="검정" name="color" value="검정" />검정</label>
				<label for="파랑"><input type="checkbox" id="파랑" name="color" value="파랑" />파랑</label>
				<label for="초록"><input type="checkbox" id="초록" name="color" value="초록" />초록</label>
				<label for="하늘"><input type="checkbox" id="하늘" name="color" value="하늘" />하늘</label>
				<label for="연두"><input type="checkbox" id="연두" name="color" value="연두" />연두</label>
				<label for="회색"><input type="checkbox" id="회색" name="color" value="회색" />회색</label>
				<label for="빨강"><input type="checkbox" id="빨강" name="color" value="빨강" />빨강</label>
				<label for="분홍"><input type="checkbox" id="분홍" name="color" value="분홍" />분홍</label>
				<label for="흰색"><input type="checkbox" id="흰색" name="color" value="흰색" />흰색</label>
				<label for="버건디"><input type="checkbox" id="버건디" name="color" value="버건디" />버건디</label>
				<label for="남색"><input type="checkbox" id="남색" name="color" value="남색" />남색</label>
				<label for="청록"><input type="checkbox" id="청록" name="color" value="청록" />청록</label>
				<label for="보라"><input type="checkbox" id="보라" name="color" value="보라" />보라</label>
				<label for="갈색"><input type="checkbox" id="갈색" name="color" value="갈색" />갈색</label>
				<label for="자주"><input type="checkbox" id="자주" name="color" value="자주" />자주</label>
				<label for="베이지"><input type="checkbox" id="베이지" name="color" value="베이지" />베이지</label>
				<label for="주황"><input type="checkbox" id="주황" name="color" value="주황" />주황</label>
				<label for="노랑"><input type="checkbox" id="노랑" name="color" value="노랑" />노랑</label>
				<label for="카키"><input type="checkbox" id="카키" name="color" value="카키" />카키</label>
			</fieldset>
			
			<fieldset id="material">
				<legend>소재</legend>
				<label for="소가죽"><input type="checkbox" id="소가죽" name="material" value="소가죽" />소가죽</label>
				<label for="송아지가죽"><input type="checkbox" id="송아지가죽" name="material" value="송아지가죽" />송아지가죽</label>
				<label for="인조가죽/합성피혁"><input type="checkbox" id="인조가죽/합성피혁" name="material" value="인조가죽/합성피혁" />인조가죽/합성피혁</label>
				<label for="스웨이드"><input type="checkbox" id="스웨이드" name="material" value="스웨이드" />스웨이드</label>
				<label for="나일론"><input type="checkbox" id="나일론" name="material" value="나일론" />나일론</label>
				<label for="패브릭"><input type="checkbox" id="패브릭" name="material" value="패브릭" />패브릭</label>
				<label for="악어가죽"><input type="checkbox" id="악어가죽" name="material" value="악어가죽" />악어가죽</label>
				<label for="양가죽"><input type="checkbox" id="양가죽" name="material" value="양가죽" />양가죽</label>
				<label for="데님"><input type="checkbox" id="데님" name="material" value="데님" />데님</label>
				<label for="에나멜"><input type="checkbox" id="에나멜" name="material" value="에나멜" />에나멜</label>
				<label for="EVA/고무"><input type="checkbox" id="EVA/고무" name="material" value="EVA/고무" />EVA/고무</label>
				<label for="면/코튼"><input type="checkbox" id="면/코튼" name="material" value="면/코튼" />면/코튼</label>
				<label for="레이온"><input type="checkbox" id="레이온" name="material" value="레이온" />레이온</label>
			</fieldset>
			
			<fieldset id="price">
				<legend>가격대</legend>
				<!-- value값 변경 가능 -->
				<label for="price1"><input type="checkbox" id="price1" name="price" value="1" />1만원-5만원</label>
				<label for="price2"><input type="checkbox" id="price2" name="price" value="2" />5만원-10만원</label>
				<label for="price3"><input type="checkbox" id="price3" name="price" value="3" />10만원-30만원</label>
				<label for="price4"><input type="checkbox" id="price4" name="price" value="4" />30만원-50만원</label>
				<label for="price5"><input type="checkbox" id="price5" name="price" value="5" />50만원 이상</label>
			</fieldset>
			
			<br />
			
			<div id="checkSubmit">
				<input type="submit" value="검색" />
			</div>
			<br />
			
		</form>

	</div>
</body>
</html>