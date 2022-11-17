import React from 'react'
import product_card from '../Product_Data'
import './Product.css';
import { useState } from 'react';

 

const Product = ({ handleClick }) => {
    
    console.log(product_card)
    const listItems=product_card.map((item)=>
    <div className="card border border-5 shadow-lg p-3 mb-5 bg-body rounded container  " key={item.id} >
        <div className="card_img">
            <img height="100px" width="100px" className='products-image ' src={item.image}></img>

        </div>
        <div className="card_header">
            <h3 className='card-title products-name text-center'>{item.product_name}</h3>
            {/* <p className="card-text">{item.description}</p> */}
            <p className="price products-price text-center">{item.price}<span>{item.currency}</span></p>
            <div className='text-center'><div onClick={()=>handleClick(item)} className=" text-center btn btn btn-primary product-add-button btn1 ">Add to Cart</div>
        </div>
        </div>

    </div>
    )
  return (
    <div className="main_content products">
        
        {listItems}
    </div>
  )
}

export default Product
