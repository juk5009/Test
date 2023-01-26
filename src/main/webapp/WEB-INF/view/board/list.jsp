<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

    <%@ include file="../layout/header.jsp" %>


        <body>
            <div class="box">
                <div class="header">
                    <h1>게시글 목록 페이지</h1>

                </div>
                <hr />
                <%@ include file="../layout/navigator.jsp" %>
                    <div class="contents">

                        <table border="1">

                            <tr>
                                <th>번호</th>
                                <th>제목</th>
                                <th>작성일</th>
                            </tr>
                            
                                <c:forEach items="${boardList}" var="board">
                                <tr>
                                    <td>${board.userid}</td>
                                    <td><a href="/board/${board.id}">${board.title}</a></td>
                                    <td>${board.createdAt}</td>
                                </tr>
                           
                                </c:forEach>
                        </table>


                    </div>
            </div>
        </body>

        <%@ include file="../layout/footer.jsp" %>