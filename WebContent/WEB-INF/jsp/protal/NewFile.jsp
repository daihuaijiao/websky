<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table width="595" border="0" cellspacing="0" cellpadding="0" style="margin: 10px 10px 10px 10px;">
		<tr>
			<td width="100%" height="20"><br> 
				<% if(totalPut < 0) { %>
				<table width="100%" border="0" cellpadding="5" cellspacing="1"
					bgcolor="#CCCCCC">
					<tr>
						<td bgcolor="#FFFFFF"><div align="center">暂时还没有任何反馈信息！</div></td>
					</tr>
				</table> 
				<%
					} else {
					for(var i=0; i<liuYanList; i++) {
				%>
				<table width="93%" border="0" align="center" cellpadding="0" cellspacing="0" class="bg6">
					<tr>
						<td width="14%" height="23" align="center" valign="bottom"	bgcolor="#F9F9F9" class="bg4">留言人</td>
						<td width="86%" valign="bottom" bgcolor="#F9F9F9" class="bg4">
							<table	width="100%" border="0" align="center" cellpadding="0" cellspacing="0">
								<tr>
									<td width="381"><font color="#5B87C8">'${liuYanList[i].username}'</font></td>
									<td width="26"><img src="image/gbook_time.gif" width="14" height="13"></td>
									<td width="142" align="left"><font color="#666666">'${liuYanList[i].time}'</font></td>
								</tr>
							</table>
						</td>
					</tr>
					<tr>
						<td align="center" valign="top"	style="border-right: #ebebeb 1px solid;">
							<img src="<%=rs("pic")%>" style="margin-top: 20"></td>
						<td>
							<table width="379" border="0" cellspacing="0" cellpadding="0" style="margin-left: 15px">
								<tr>
									<td width="45" height="25"><font color="#FF0000">[标题]</font></td>
									<td width="334"><%=rs("title")%></td>
								</tr>
								<tr>
									<td height="1" colspan="2" background="../images/line.gif"></td>
								</tr>
								<tr>
									<td height="25"><font color="#FF0000">[内容]</font></td>
									<td><a class="d" href="#"
										onClick="MM_openBrWindow('guest_Show.asp?id=<%=rs("id")%>','','scrollbars=yes,width=550,height=400');return false;"><%=gottopic(rs("content"),200)%></a></td>
								</tr>
								<tr>
									<td height="1" colspan="2" background="../images/line.gif"></td>
								</tr>
								<tr>
									<td colspan="2">管理员<font color="#FF0000">[<%=ors("r_username")%>]
									</font>回复:<%=ors("r_content")%>
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table><br>
				<%
						}
					}
				%>
				<br>
				<table width="100%" border="0" cellspacing="0" cellpadding="0">
					<tr>
						<td>
							<!-- 分页显示代码块可独立使用,注意和上面分页功能代码配使用 -->
							<div align="center">
								当前第<font color="#ff0000"><%=currentpage%></font>页 总共
								<font color="#FF0000"><%=n%></font>页 共<font color="#FF0000"><%=rs.recordcount%></font>个留言信息
								<%
								k=currentPage 
								if k<>1 then 
									response.write "[<b>"+"<a href='guestlist.asp?page=1'>首页</a></b>] "
									response.write "[<b>"+"<a href='guestlist.asp?page="&cstr(k-1)&"'>上一页</a></b>] " 
								else 
									Response.Write "[首页] [上一页]" 
								end if 
								if k<>n then 
								response.write "[<b>"+"<ahref='guestlist.asp?page="&cstr(k+1)&"'>下一页</a></b>] " 
								response.write"[<b>"+"<a href='guestlist.asp?page="&cstr(n)&"'>尾页</a></b>] " 
								else
									Response.Write " [下一页] [尾页]" 
									end if 
									%>
						</td>
					</tr>
				</table>
			</td>
		</tr>
		<tr>
			<td></td>
		</tr>
	</table>
	
	
	<div id="showLiuYan" >
									<table width="595" border="0" cellspacing="0" cellpadding="0" style="margin: 10px 10px 10px 10px;">
										<tr>
											<td width="100%" height="20"><br> 
												<c:if test="${liuYanList }">
													<table width="100%" border="0" cellpadding="5" cellspacing="1" bgcolor="#CCCCCC">
														<tr>
															<td bgcolor="#FFFFFF"><div align="center">暂时还没有任何反馈信息！</div></td>
														</tr>
													</table>
													<c:forEach var="itm" items="${liuYanList }">
														<table width="93%" border="0" align="center" cellpadding="0" cellspacing="0" class="bg6">
															<tr>
																<td width="14%" height="23" align="center" valign="bottom"	bgcolor="#F9F9F9" class="bg4">留言人</td>
																<td width="381"><font color="#5B87C8">'${liuYanList[i].username}'</font></td>
																<td width="26"><img src="image/gbook_time.gif" width="14" height="13"></td>
																<td width="142" align="left"><font color="#666666">'${liuYanList[i].time}'</font></td>
															</tr>
															<tr>
																<td width="45" height="25"><font color="#FF0000">[标题]</font></td>
																<td width="334">'${liuYanList[i].title}'</td>
															</tr>
															<tr>
																<td height="1" colspan="2" background="../images/line.gif"></td>
															</tr>
															<tr>
																<td height="25"><font color="#FF0000">[内容]</font></td>
																<td><a class="d" href="#"
																	onClick="MM_openBrWindow('guest_Show.asp?id='${liuYanList[i].content}'','','scrollbars=yes,width=550,height=400');return false;">'${liuYanList[i].time}'></a></td>
															</tr>
															<tr>
																<td height="1" colspan="2" background="../images/line.gif"></td>
															</tr>
															<tr>
																<td colspan="2">管理员<font color="#FF0000">['${liuYanList[i].time}']
																</font>回复:'${liuYanList[i].time}'
																</td>
															</tr>
														</table><br>
													</c:forEach>
												</c:if>
												<br>
												<table width="100%" border="0" cellspacing="0" cellpadding="0">
													<tr>
														<td>
														</td>
													</tr>
												</table>
											</td>
										</tr>
										<tr>
											<td></td>
										</tr>
									</table>
								</div>
</body>
</html>