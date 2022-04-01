package com.mobiledua.bayumarket.ui.auth.signin

import com.mobiledua.bayumarket.base.BasePresenter
import com.mobiledua.bayumarket.base.BaseView
import com.mobiledua.bayumarket.model.response.login.LoginResponse

interface SigninContract {

    interface View: BaseView {
        fun onLoginSuccess(loginResponse: LoginResponse)
        fun onLoginFailed(message:String)

    }

    interface Presenter : SigninContract, BasePresenter {
        fun subimtLogin(email:String, password:String)
    }
}