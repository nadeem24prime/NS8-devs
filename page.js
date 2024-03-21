'use client'
import React, { useState } from "react";
import styles from './page.module.css'
export default function Hpme(){
  const [datat , setdata] = useState(null)
  return(
    <div>
            <h1 className={styles.heda}>get started</h1>
      <div className={styles.mai}>
        <h2 className={styles.login}>login</h2>
        <input onChange={(e) => setname(e.target.value)} className={styles.name} type="text" placeholder="enter your name..." ></input>
        <input onChange={(e) => setpass(e.target.value)} placeholder="set a password" type="password" className={styles.name} style={{top: 140}}></input>
        <button className={styles.lgin} onClick={async () => {

          window.location.href = '/home'
     
        }}>LOGIN</button>
      </div>
    </div>
  )
}