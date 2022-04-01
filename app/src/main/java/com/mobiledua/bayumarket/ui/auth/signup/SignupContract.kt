package com.mobiledua.bayumarket.ui.auth.signup

import android.net.Uri
import com.mobiledua.bayumarket.base.BasePresenter
import com.mobiledua.bayumarket.base.BaseView
import com.mobiledua.bayumarket.model.request.RegisterRequest
import com.mobiledua.bayumarket.model.response.login.LoginResponse

interface SignupContract {

    interface View: BaseView {
        fun onRegisterSuccess(loginResponse: LoginResponse,
                              view:android.view.View)
        fun onRegisterPhotoSuccess(view:android.view.View)
        fun onRegisterFailed(message:String)

    }

    interface Presenter : SignupContract, BasePresenter {
        fun submitRegister(registerRequest: RegisterRequest,
                           view:android.view.View)
        fun submitPhotoRegister(filePath: Uri, view:android.view.View)
    }
}