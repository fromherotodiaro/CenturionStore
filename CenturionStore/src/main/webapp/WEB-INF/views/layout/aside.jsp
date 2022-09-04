<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<div class="panel panel-default">
	<div class="panel-heading">Shopping Cart</div>
	<div class="panel-body">
		<img src="/static/images/shoppingcart.gif" class="col-sm-5">
		<ul class="col-sm-7">
			<li>10 mặt hàng</li>
			<li>150 $</li>
			<li>
				<a href="">Xem giỏ hàng</a>
			</li>
		</ul>
	</div>
</div>

<div class="panel panel-default">
	<div class="panel-heading">TÌM KIẾM</div>
	<div class="panel-body">
		<form action="/product/search" method="post">
			<input name="keywords" class="form-control" placeholder="Keywords">
		</form>
	</div>
</div>

<div class="panel panel-default">
	<div class="panel-heading">DANH MỤC</div>
	<div class="list-group">
		<a href="#" class="list-group-item disabled">First item</a> <a
			href="#" class="list-group-item">Second item</a> <a href="#"
			class="list-group-item">Third item</a>
	</div>
</div>

<div class="panel panel-default">
	<div class="panel-heading">ĐẶC BIỆT</div>
	<div class="list-group">
		<a href="#" class="list-group-item disabled">Hàng mới</a> <a href="#"
			class="list-group-item">Hàng bán Chạy</a> <a href="#"
			class="list-group-item">Hàng yêu thích</a> <a href="#"
			class="list-group-item">Hàng giảm giá</a>

	</div>
</div>

