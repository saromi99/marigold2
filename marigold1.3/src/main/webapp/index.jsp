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

<style>
body {
	margin: 0 auto;
}
form {
    margin:0 auto;
    width: 520px;
}
#checkSubmit{
	margin:0 auto;
}

</style>
</head>
<body>
	<div id="main">
		<form method="get" action="getSearchList.do">
			<input type="text" name="searchKeyword" /> <input type="submit" value="검색" />
		</form>
		<!-- name은 앞으로 정해야함. 검색어로 검색은 나중에 !-->
	</div>
	<br />
	<br />
	<div id="container">
		<form method="post" action="getCheckList.do"> 
			<fieldset>
				<legend>성별 및 연령</legend>
				<input type="radio" name="firstCategory" value="M" />남성
				<input type="radio" name="firstCategory" value="W" />여성
				<input type="radio" name="firstCategory" value="U" checked="checked" />남녀공용
				<input type="radio" name="firstCategory" value="K" />키즈
			</fieldset>
			
			<fieldset>
				<legend>카테고리</legend>
				<input type="radio" name="secondCategory" value="S" checked="checked" />슈즈
				<input type="radio" name="secondCategory" value="C" />의류
				<input type="radio" name="secondCategory" value="B" />가방
				<input type="radio" name="secondCategory" value="A" />액세서리
			</fieldset>
			
			<fieldset>
				<legend>슈즈</legend>
				<input type="checkbox" name="thirdCategory" value="1" />운동화
				<input type="checkbox" name="thirdCategory" value="2" />스포츠
				<input type="checkbox" name="thirdCategory" value="3" />구두
				<input type="checkbox" name="thirdCategory" value="4" />샌들
				<input type="checkbox" name="thirdCategory" value="5" />캐주얼
				<input type="checkbox" name="thirdCategory" value="6" />부츠
			</fieldset>
			
			<fieldset>
				<legend>스타일</legend>
				<input type="checkbox" name="fourthCategory" value="01" />캔버스화
				<input type="checkbox" name="fourthCategory" value="02" />스니커즈
				<input type="checkbox" name="fourthCategory" value="03" />슬립온
				<input type="checkbox" name="fourthCategory" value="04" />어글리슈즈
				<input type="checkbox" name="fourthCategory" value="05" />커스텀
				
				<input type="checkbox" name="fourthCategory" value="06" />런닝화
				<input type="checkbox" name="fourthCategory" value="07" />농구화
				<input type="checkbox" name="fourthCategory" value="08" />골프화
				<input type="checkbox" name="fourthCategory" value="09" />등산화
				<input type="checkbox" name="fourthCategory" value="10" />기능화
				<input type="checkbox" name="fourthCategory" value="11" />축구화
				
				<input type="checkbox" name="fourthCategory" value="12" />로퍼/플랫
				<input type="checkbox" name="fourthCategory" value="13" />힐/펌프스
				<input type="checkbox" name="fourthCategory" value="14" />슬링백/토오픈
				<input type="checkbox" name="fourthCategory" value="15" />뮬/블로퍼
				<input type="checkbox" name="fourthCategory" value="16" />레이스업
				
				<input type="checkbox" name="fourthCategory" value="17" />슬라이드
				<input type="checkbox" name="fourthCategory" value="18" />아쿠아슈즈
				<input type="checkbox" name="fourthCategory" value="19" />스포츠샌들
				<input type="checkbox" name="fourthCategory" value="20" />코르크샌들
				<input type="checkbox" name="fourthCategory" value="21" />레더샌들
				<input type="checkbox" name="fourthCategory" value="22" />드레스샌드
				<input type="checkbox" name="fourthCategory" value="23" />슬리퍼
				
				<input type="checkbox" name="fourthCategory" value="24" />워킹슈즈
				
				<input type="checkbox" name="fourthCategory" value="25" />워커부츠
				<input type="checkbox" name="fourthCategory" value="26" />패딩부츠
				<input type="checkbox" name="fourthCategory" value="27" />첼시부츠
				<input type="checkbox" name="fourthCategory" value="28" />미들부츠
				<input type="checkbox" name="fourthCategory" value="29" />롱부츠
				<input type="checkbox" name="fourthCategory" value="30" />레인부츠
				<input type="checkbox" name="fourthCategory" value="31" />어그부츠
				<input type="checkbox" name="fourthCategory" value="32" />앵클부츠
			</fieldset>
			
			<fieldset>
				<legend>브랜드</legend>
				<input type="checkbox" name="brand" value="001" />샤넬
				<input type="checkbox" name="brand" value="002" />셀린느
				<input type="checkbox" name="brand" value="003" />멀버리
				<input type="checkbox" name="brand" value="004" />버버리
				<input type="checkbox" name="brand" value="005" />메종마르지엘라
				<input type="checkbox" name="brand" value="006" />벨루티
				<input type="checkbox" name="brand" value="007" />발리
				<input type="checkbox" name="brand" value="008" />발망
				<input type="checkbox" name="brand" value="009" />페레가모
				<input type="checkbox" name="brand" value="010" />루이비통
				<input type="checkbox" name="brand" value="011" />구찌
				<input type="checkbox" name="brand" value="012" />디올
				<input type="checkbox" name="brand" value="013" />지방시
				<input type="checkbox" name="brand" value="014" />빈폴
				<input type="checkbox" name="brand" value="015" />폴로
				<input type="checkbox" name="brand" value="016" />랄프로렌
				<input type="checkbox" name="brand" value="017" />에르메스
				<input type="checkbox" name="brand" value="018" />로로피아나
				<input type="checkbox" name="brand" value="019" />쿠치멜리
				<input type="checkbox" name="brand" value="020" />마이클코어스
				<input type="checkbox" name="brand" value="021" />마크제이콥스
				<input type="checkbox" name="brand" value="022" />끌로에
				<input type="checkbox" name="brand" value="023" />프라다
				<input type="checkbox" name="brand" value="024" />르꼬끄
				<input type="checkbox" name="brand" value="025" />데상트
				<input type="checkbox" name="brand" value="026" />컨버스
				<input type="checkbox" name="brand" value="027" />크록스
				<input type="checkbox" name="brand" value="028" />라코스테
				<input type="checkbox" name="brand" value="029" />금강재화
				<input type="checkbox" name="brand" value="030" />리복
				<input type="checkbox" name="brand" value="031" />아키클래식
				<input type="checkbox" name="brand" value="032" />캐치볼
				<input type="checkbox" name="brand" value="033" />닥터마틴
				<input type="checkbox" name="brand" value="034" />팀버랜드
				<input type="checkbox" name="brand" value="035" />프레드페리
				<input type="checkbox" name="brand" value="036" />스케쳐스
				<input type="checkbox" name="brand" value="037" />푸마
				<input type="checkbox" name="brand" value="038" />포즈간츠
				<input type="checkbox" name="brand" value="039" />스테파노로시
				<input type="checkbox" name="brand" value="040" />마크모크
				<input type="checkbox" name="brand" value="041" />버켄스탁
				<input type="checkbox" name="brand" value="042" />젝시믹스
				<input type="checkbox" name="brand" value="043" />포티세컨드
				<input type="checkbox" name="brand" value="044" />뉴에라
				<input type="checkbox" name="brand" value="045" />에버레스트
				<input type="checkbox" name="brand" value="046" />스프리트
				<input type="checkbox" name="brand" value="047" />써코니
				<input type="checkbox" name="brand" value="048" />아식스
				<input type="checkbox" name="brand" value="049" />블랙마틴싯봉
				<input type="checkbox" name="brand" value="050" />블라도
				<input type="checkbox" name="brand" value="051" />호킨스
				<input type="checkbox" name="brand" value="052" />무인양품
			</fieldset>
			
			<fieldset>
				<legend>색상 계열</legend>
				<input type="checkbox" name="color" value="검정" />검정
				<input type="checkbox" name="color" value="파랑" />파랑
				<input type="checkbox" name="color" value="초록" />초록
				<input type="checkbox" name="color" value="하늘" />하늘
				<input type="checkbox" name="color" value="연두" />연두
				<input type="checkbox" name="color" value="회색" />회색
				<input type="checkbox" name="color" value="빨강" />빨강
				<input type="checkbox" name="color" value="분홍" />분홍
				<input type="checkbox" name="color" value="흰색" />흰색
				<input type="checkbox" name="color" value="버건디" />버건디
				<input type="checkbox" name="color" value="남색" />남색
				<input type="checkbox" name="color" value="청록" />청록
				<input type="checkbox" name="color" value="보라" />보라
				<input type="checkbox" name="color" value="갈색" />갈색
				<input type="checkbox" name="color" value="자주" />자주
				<input type="checkbox" name="color" value="베이지" />베이지
				<input type="checkbox" name="color" value="주황" />주황
				<input type="checkbox" name="color" value="노랑" />노랑
				<input type="checkbox" name="color" value="카키" />카키	
			</fieldset>
			
			<fieldset>
				<legend>소재</legend>
				<input type="checkbox" name="material" value="소가죽" />소가죽
				<input type="checkbox" name="material" value="송아지가죽" />송아지가죽
				<input type="checkbox" name="material" value="인조가죽/합성피혁" />인조가죽/합성피혁
				<input type="checkbox" name="material" value="스웨이드" />스웨이드
				<input type="checkbox" name="material" value="나일론" />나일론
				<input type="checkbox" name="material" value="패브릭" />패브릭
				<input type="checkbox" name="material" value="악어가죽" />악어가죽
				<input type="checkbox" name="material" value="양가죽" />양가죽
				<input type="checkbox" name="material" value="데님" />데님
				<input type="checkbox" name="material" value="에나멜" />에나멜
				<input type="checkbox" name="material" value="EVA/고무" />EVA/고무
				<input type="checkbox" name="material" value="면/코튼" />면/코튼
				<input type="checkbox" name="material" value="레이온" />레이온
			</fieldset>
			
			<fieldset>
				<legend>가격대</legend>
				<!-- value값 변경 가능 -->
				<input type="checkbox" name="price" value="1" />1만원-5만원
				<input type="checkbox" name="price" value="2" />5만원-10만원
				<input type="checkbox" name="price" value="3" />10만원-30만원
				<input type="checkbox" name="price" value="4" />30만원-50만원
				<input type="checkbox" name="price" value="5" />50만원 이상
			</fieldset>
			
			<br />
			<center>
				<input id="checkSubmit" type="submit" value="검색" />
			</center>
			<br />
			
		</form>

	</div>
</body>
</html>