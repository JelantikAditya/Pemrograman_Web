const umur = parseInt(prompt("Masukkan umur Anda:"), 10);

if (isNaN(umur)) {
  alert("Masukkan angka yang valid!");
  document.body.innerHTML = "<h1 style='text-align:center;margin-top:40vh;'>Input tidak valid!</h1>";
} else if (umur < 17) {
  alert("Maaf, Anda belum cukup umur...");
  const overlay = document.getElementById("blockedOverlay");
  overlay.style.display = "flex";
  document.body.classList.add("no-scroll");

  const audio = document.getElementById("bgm");
  audio.volume = volume / 100;
  audio.play().catch(() => {
    console.log("Autoplay dicegah browser. Klik layar untuk memulai audio.");
  });

} else {
  alert("Selamat datang di halaman praktikum!");
  document.getElementById("praktikumPage").style.display = "block";
}

document.getElementById("ubahJudul").addEventListener("click", function() {
  const judulBaru = prompt("Masukkan judul baru:");
  if (judulBaru && judulBaru.trim() !== "") {
    document.getElementById("judul").textContent = judulBaru.trim();
  }
});

document.getElementById("proses").addEventListener("click", function() {
  const nama = document.getElementById("namaUser").value.trim();
  const angka = parseInt(document.getElementById("angka").value.trim());
  const hasilDiv = document.getElementById("hasil");

  if (!nama || isNaN(angka)) {
    alert("Masukkan nama dan angka yang valid!");
    return;
  }

  let bilGenap = [];
  for (let i = 2; i <= angka; i += 2) {
    bilGenap.push(i);
  }

  hasilDiv.innerHTML = `
    <p>Halo, <strong>${nama}</strong>!</p>
    <p>Bilangan genap hingga ${angka}:</p>
    <p>${bilGenap.join(", ")}</p>
  `;
});

document.getElementById("reset").addEventListener("click", function() {
  document.getElementById("namaUser").value = "";
  document.getElementById("angka").value = "";
  document.getElementById("hasil").innerHTML = "";
  document.getElementById("judul").textContent = "Halaman Praktikum";
});
