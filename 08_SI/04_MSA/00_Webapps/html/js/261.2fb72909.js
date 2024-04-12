"use strict";(self["webpackChunkfrontend_vue"]=self["webpackChunkfrontend_vue"]||[]).push([[261],{4833:function(e,t,l){var r=l(5398);class a{getAll(e,t,l){return r.A.get(`/shop/simple-cart?title=${e}&page=${t}&size=${l}`)}create(e){return r.A.post("/shop/simple-cart",e)}remove(e){return r.A.delete(`/shop/simple-cart/deletion/${e}`)}}t.A=new a},7737:function(e,t,l){var r=l(5398);class a{create(e){return r.A.post("/shop/simple-order",e)}get(e){return r.A.get(`/shop/simple-order/${e}`)}}t.A=new a},4261:function(e,t,l){l.r(t),l.d(t,{default:function(){return U}});var r=l(6768),a=l(5130),s=l(4232);const o={class:"row mb-5 justify-content-center"},i={class:"col-12 w-50 input-group mb-3"},n={class:"input-group-append"},c={class:"col-12 w-25 mb-3"},d=["value"],p={class:"row"},u={class:"row g-0 p-3"},m={class:"col-md-4 p-3 border"},v=["src"],g={class:"col-md-8"},h={class:"card-body"},k={class:"card-title"},y={class:"card-title"},C={class:"card-title"},b={class:"col-12 mx-auto"},L={class:"row g-3 align-items-center mb-3"},A=(0,r.Lk)("div",{class:"col-3"},[(0,r.Lk)("label",{htmlFor:"deliveryAddr",class:"col-form-label"}," 배송주소 ")],-1),f={class:"col-9"},w={class:"row g-3 align-items-center mb-3"},S=(0,r.Lk)("div",{class:"col-3"},[(0,r.Lk)("label",{htmlFor:"deliveryMsg",class:"col-form-label"}," 배송 메세지 ")],-1),$={class:"col-9"},z={class:"row d-flex justify-content-end"};function M(e,t,l,M,V,F){const _=(0,r.g2)("b-pagination");return(0,r.uX)(),(0,r.CE)("div",null,[(0,r.Lk)("div",o,[(0,r.Lk)("div",i,[(0,r.bo)((0,r.Lk)("input",{type:"text",class:"form-control",placeholder:"제목검색","onUpdate:modelValue":t[0]||(t[0]=e=>V.searchTitle=e)},null,512),[[a.Jo,V.searchTitle]]),(0,r.Lk)("div",n,[(0,r.Lk)("button",{class:"btn btn-outline-secondary",type:"button",onClick:t[1]||(t[1]=(...e)=>F.retrieveSimpleCart&&F.retrieveSimpleCart(...e))}," 검색 ")])])]),(0,r.Lk)("div",c,[(0,r.eW)(" 1페이지당 개수 : "),(0,r.bo)((0,r.Lk)("select",{class:"form-select form-select-sm","onUpdate:modelValue":t[2]||(t[2]=e=>V.pageSize=e),onChange:t[3]||(t[3]=(...e)=>F.pageSizeChange&&F.pageSizeChange(...e))},[((0,r.uX)(!0),(0,r.CE)(r.FK,null,(0,r.pI)(V.pageSizes,((e,t)=>((0,r.uX)(),(0,r.CE)("option",{key:t,value:e},(0,s.v_)(e),9,d)))),128))],544),[[a.u1,V.pageSize]])]),(0,r.bF)(_,{class:"col-12 mb-3",modelValue:V.page,"onUpdate:modelValue":t[4]||(t[4]=e=>V.page=e),"total-rows":V.count,"per-page":V.pageSize,onClick:F.retrieveSimpleCart},null,8,["modelValue","total-rows","per-page","onClick"]),(0,r.Lk)("div",p,[((0,r.uX)(!0),(0,r.CE)(r.FK,null,(0,r.pI)(V.simpleCart,((e,t)=>((0,r.uX)(),(0,r.CE)("div",{key:t,class:"card mb-3"},[(0,r.Lk)("div",u,[(0,r.Lk)("div",m,[(0,r.Lk)("img",{src:e.imgPath,class:"img-fluid rounded-start",alt:"...",style:{"{ height":"15 + 'vh', width: 5 + 'vw' }"}},null,8,v)]),(0,r.Lk)("div",g,[(0,r.Lk)("div",h,[(0,r.Lk)("h5",k,"물품명 : "+(0,s.v_)(e.title),1),(0,r.Lk)("h5",y,"물품가격 : "+(0,s.v_)(e.unitPrice*e.cartCount),1),(0,r.Lk)("h5",C,"장바구니 개수 :"+(0,s.v_)(e.cartCount),1)])])])])))),128))]),(0,r.Lk)("div",b,[(0,r.Lk)("div",L,[A,(0,r.Lk)("div",f,[(0,r.bo)((0,r.Lk)("input",{type:"text",id:"deliveryAddr",required:"",class:"form-control",placeholder:"배송지 주소",name:"deliveryAddr","onUpdate:modelValue":t[5]||(t[5]=e=>V.deliveryAddr=e)},null,512),[[a.Jo,V.deliveryAddr]])])]),(0,r.Lk)("div",w,[S,(0,r.Lk)("div",$,[(0,r.bo)((0,r.Lk)("input",{type:"text",id:"deliveryMsg",required:"",class:"form-control",placeholder:"배송 메세지",name:"deliveryMsg","onUpdate:modelValue":t[6]||(t[6]=e=>V.deleveryMsg=e)},null,512),[[a.Jo,V.deleveryMsg]])])])]),(0,r.Lk)("div",z,[(0,r.Lk)("button",{type:"button",class:"btn btn-danger w-25 me-3",onClick:t[7]||(t[7]=(...e)=>F.cancelOrder&&F.cancelOrder(...e))}," 주문 취소 "),(0,r.Lk)("button",{type:"button",class:"btn btn-warning w-25",onClick:t[8]||(t[8]=(...e)=>F.goApproval&&F.goApproval(...e))}," 결재 ")])])}l(4114);var V=l(4833),F=l(7737),_={data(){return{simpleCart:[],searchTitle:"",deliveryAmount:3e3,deliveryAddr:"",deleveryMsg:"",page:1,count:0,pageSize:3,pageSizes:[3,6,9]}},methods:{async retrieveSimpleCart(){try{let e=await V.A.getAll(this.searchTitle,this.page-1,this.pageSize);const{simpleCart:t,totalItems:l}=e.data;this.simpleCart=t,this.count=l,console.log(e.data)}catch(e){console.log(e)}},async goApproval(){let e=new Date,t=`${e.getFullYear()}-${e.getMonth()}-${e.getDate()} ${e.getHours()}:${e.getMinutes()}:${e.getSeconds()}`,l=this.simpleCart.map((e=>e.unitPrice*e.cartCount)).reduce(((e,t)=>e+t)),r={sono:null,spno:0,productCount:0},a=[];for(const o of this.simpleCart)r.spno=o.spno,r.productCount=o.cartCount,a.push(r);try{let e={simpleOrderDetailList:a,orderDate:t,orderStatus:50001,productAmount:l,deliveryAmount:this.deliveryAmount,orderAmount:l+this.deliveryAmount,deliveryAddr:this.deliveryAddr,deliveryMsg:this.deliveryMsg},r=await F.A.create(e);console.log(r.data),this.$router.push("/simple-approval/"+r.data.sono)}catch(s){console.log(s)}},cancelOrder(){this.$router.push("/simple-cart")},pageSizeChange(){this.page=1,this.retrieveSimpleCart()}},mounted(){this.retrieveSimpleCart()}},x=l(1241);const E=(0,x.A)(_,[["render",M]]);var U=E}}]);
//# sourceMappingURL=261.2fb72909.js.map