import 'bootstrap/dist/css/bootstrap.min.css';
import './assets/css/style.css';

function App() {
  return (
    <div>
      <meta charSet="UTF-8" />
      <meta
        name="viewport"
        content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0"
      />
      <meta httpEquiv="X-UA-Compatible" content="ie=edge" />
      <title>Flexbook</title>
      {/*    CSS Bootstrap */}
      <link href="./assets/css/bootstrap.min.css" rel="stylesheet" />
      <link
        rel="stylesheet"
        href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css"
        integrity="sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw=="
        crossOrigin="anonymous"
        referrerPolicy="no-referrer"
      />
      {/*    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">*/}
      {/*    CSS MyStyle */}
      <link rel="stylesheet" href="./assets/css/style.css" />
      {/* Login */}
      <div className="container mt-5 pt-5 d-flex flex-column flex-lg-row justify-content-evenly">
        {/* heading */}
        <div className="text-center text-lg-start mt-0 pt-0 mt-lg-5 pt-lg-5">
          <h1 className="text-primary fw-bold fs-0">flexbook</h1>
          <p className="w-75 mx-auto fs-4 mx-lg-0">
            Flexbook helps you connect and share with the people in your life.
          </p>
        </div>
        {/* form card */}
        <div style={{ maxWidth: "28rem", width: "100%" }}>
          {/* login form */}
          {/* first was form tag */}
          <div className="bg-white shadow rounded p-3 input-group-lg">
            <input
              type="email"
              className="form-control my-3"
              placeholder="Email address or phone number"
            />
            <input
              type="password"
              className="form-control my-3"
              placeholder="Password"
            />
            <a href="./feed">
              <button className="btn btn-primary w-100 my-3">Log In</button>
            </a>
            <a href="#" className="text-decoration-none text-center">
              <p>Forgotten password?</p>
            </a>
            {/* create form */}
            <hr />
            <div className="text-center my-4">
              <button
                className="btn btn-success btn-lg"
                type="button"
                data-bs-toggle="modal"
                data-bs-target="#createModal"
              >
                Create New Account
              </button>
            </div>
            {/* create modal */}
            <div
              className="modal fade"
              id="createModal"
              tabIndex={-1}
              aria-labelledby="createModalLabel"
              aria-hidden="true"
            >
              <div className="modal-dialog modal-dialog-centered">
                <div className="modal-content">
                  {/* head */}
                  <div className="modal-header">
                    <div>
                      <h2 className="modal-title" id="exampleModalLabel">
                        Sign Up
                      </h2>
                      <span className="text-muted fs-7">
                        Its quick and easy.
                      </span>
                    </div>
                    <button
                      type="button"
                      className="btn-close"
                      data-bs-dismiss="modal"
                      aria-label="Close"
                    />
                  </div>
                  {/* body */}
                  <div className="modal-body">
                    <form>
                      {/* names */}
                      <div className="row">
                        <div className="col">
                          <input
                            type="text"
                            className="form-control"
                            placeholder="First name"
                          />
                        </div>
                        <div className="col">
                          <input
                            type="text"
                            className="form-control"
                            placeholder="Surname"
                          />
                        </div>
                      </div>
                      {/* email & pass */}
                      <input
                        type="email"
                        className="form-control my-3"
                        placeholder="Mobile number or email address"
                      />
                      <input
                        type="password"
                        className="form-control my-3"
                        placeholder="New password"
                      />
                      {/* DOB */}
                      <div className="row my-3">
                        <span className="text-muted fs-7">
                          Date of birth{" "}
                          <i
                            className="fas fa-question-circle"
                            data-bs-toggle="popover"
                            type="button"
                            data-bs-content="And here's some amazing content. It's very engaging. Right?"
                          />
                        </span>
                        <div className="col">
                          <select className="form-select">
                            <option value={1}>One</option>
                            <option value={2}>Two</option>
                            <option value={3}>Three</option>
                          </select>
                        </div>
                        <div className="col">
                          <select className="form-select">
                            <option value={1}>One</option>
                            <option value={2}>Two</option>
                            <option value={3}>Three</option>
                          </select>
                        </div>
                        <div className="col">
                          <select className="form-select">
                            <option value={1}>One</option>
                            <option value={2}>Two</option>
                            <option value={3}>Three</option>
                          </select>
                        </div>
                      </div>
                      {/* gender */}
                      <div className="row my-3">
                        <span className="text-muted fs-7">
                          Gender{" "}
                          <i
                            className="fas fa-question-circle"
                            data-bs-toggle="popover"
                            type="button"
                            data-bs-content="And here's some amazing content. It's very engaging. Right?"
                          />
                        </span>
                        <div className="col">
                          <div className="border rounded p-2">
                            <label
                              className="form-check-label"
                              htmlFor="flexRadioDefault1"
                            >
                              Male{" "}
                            </label>
                            <input
                              className="form-check-input"
                              type="radio"
                              name="flexRadioDefault"
                              id="flexRadioDefault1"
                            />
                          </div>
                        </div>
                        <div className="col">
                          <div className="border rounded p-2">
                            <label
                              className="form-check-label"
                              htmlFor="flexRadioDefault1"
                            >
                              Female{" "}
                            </label>
                            <input
                              className="form-check-input"
                              type="radio"
                              name="flexRadioDefault"
                              id="flexRadioDefault2"
                            />
                          </div>
                        </div>
                        <div className="col">
                          <div className="border rounded p-2">
                            <label
                              className="form-check-label"
                              htmlFor="flexRadioDefault1"
                            >
                              Custom{" "}
                            </label>
                            <input
                              className="form-check-input"
                              type="radio"
                              name="flexRadioDefault"
                              id="flexRadioDefault3"
                            />
                          </div>
                        </div>
                      </div>
                      {/* gender select */}
                      <div className="d-none" id="genderSelect">
                        <select className="form-select">
                          <option value={1}>One</option>
                          <option value={2}>Two</option>
                          <option value={3}>Three</option>
                        </select>
                        <div className="my-3">
                          <span className="text-muted fs-7">
                            Your pronoun is visible to everyone.
                          </span>
                          <input
                            type="text"
                            className="form-control"
                            placeholder="Gender (optional)"
                          />
                        </div>
                      </div>
                      {/* disclaimer */}
                      <div>
                        <span className="text-muted fs-7">
                          By clicking Sign Up, you agree to our Terms, Data
                          Policy....
                        </span>
                      </div>
                      {/* btn */}
                      <div className="text-center mt-3">
                        <button
                          type="button"
                          className="btn btn-success btn-lg"
                          data-bs-dismiss="modal"
                        >
                          Sign Up
                        </button>
                      </div>
                    </form>
                  </div>
                </div>
              </div>
            </div>
            {/* modal end */}
          </div>
          {/* tag */}
          <div className="my-5 pb-5 text-center">
            <p className="fw-bold">
              <a href="#" className="text-decoration-none text-dark">
                Createa a Page
              </a>{" "}
              <span className="fw-normal">
                for a celebrity, band or business.
              </span>
            </p>
          </div>
        </div>
      </div>
      {/* Footer */}
      <footer className="bg-white p-4 text-muted">
        <div className="container">
          {/* language */}
          <div className="d-flex flex-wrap">
            <p className="mx-2 fs-7 mb-0">English (US)</p>
            <p className="mx-2 fs-7 mb-0">Tiếng Việt</p>
            <p className="mx-2 fs-7 mb-0">中文(台灣)</p>
            <p className="mx-2 fs-7 mb-0">한국어</p>
            <p className="mx-2 fs-7 mb-0">日本語</p>
          </div>
          <hr />
          {/* actions */}
          <div className="d-flex flex-wrap">
            <p className="mx-2 fs-7 mb-0">Sign Up</p>
            <p className="mx-2 fs-7 mb-0">Login</p>
            <p className="mx-2 fs-7 mb-0">Messenger</p>
            <p className="mx-2 fs-7 mb-0">Facebook Lite</p>
            <p className="mx-2 fs-7 mb-0">Watch</p>
          </div>
          {/* copy */}
          <div className="mt-4 mx-2">
            <p className="fs-7">Flexbook © 2023</p>
          </div>
        </div>
      </footer>
    </div>
  );
}

export default App;
